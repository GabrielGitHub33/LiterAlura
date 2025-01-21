package com.br.gabriel.literalura.service;

import com.br.gabriel.literalura.model.Autor;
import com.br.gabriel.literalura.model.Livro;
import com.br.gabriel.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;


}
