package br.com.alura.screanmacth.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
