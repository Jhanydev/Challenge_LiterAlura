package com.literalura.model;

public class Autor {
    private String nome;
    private int nascimento;
    private int falecimento;

    public Autor(String nome, int nascimento, int falecimento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.falecimento = falecimento;
    }

    public String getNome() { return nome; }
    public int getNascimento() { return nascimento; }
    public int getFalecimento() { return falecimento; }

    @Override
    public String toString() {
        return String.format("%s (%d - %d)", nome, nascimento, falecimento);
    }
}
