package com.br.gabriel.literalura.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
