package com.br.gabriel.literalura.repository;

import com.br.gabriel.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    // Método de busca por título
    List<Livro> findByTituloContainingIgnoreCase(String titulo);

    // Método de busca por idioma utilizando convenção do Spring Data JPA
    List<Livro> findByIdiomaIgnoreCase(String idioma);

    // Método de busca por idioma utilizando uma consulta personalizada com @Query
    @Query("SELECT l FROM Livro l WHERE l.idioma = :idioma")
    List<Livro> buscarLivrosPorIdioma(@Param("idioma") String idioma);
}
