package com.literalura.model;

public class Livro {
    private String titulo;
    private String autor;
    private String idioma;

    public Livro(String titulo, String autor, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIdioma() { return idioma; }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Idioma: %s", titulo, autor, idioma);
    }
}
