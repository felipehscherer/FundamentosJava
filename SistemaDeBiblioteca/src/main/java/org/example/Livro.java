package org.example;

import jdk.jshell.Snippet;

import java.util.Arrays;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private Categoria categoria;
    private boolean emprestado;
    Livro[] estanteDeLivro = new Livro[100];

    public Livro(String titulo, String autor, int anoDePublicacao, Categoria categoria, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.categoria = categoria;
        this.emprestado = emprestado;

    }

    @Override
    public String toString() {
        return "Livro: " + titulo +
                ", Autor: " + autor +
                ", De: " + anoDePublicacao +
                ", Categoria: " + categoria +
                ", Emprestado: " + emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Categoria getCategoria(){
        return categoria;
    }
}
