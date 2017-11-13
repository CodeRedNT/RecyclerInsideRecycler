package com.ranyele.recyclerinsiderecycler.model;

/**
 * Created by ranyeleamorim on 13/11/17.
 */

public class CarouselList {

    private int imagem;
    private int favorito;
    private String titulo;
    private String descricao;
    private int pontuacao;
    private String labelPontuacao;

    public CarouselList(int imagem, int favorito, String titulo, String descricao, int pontuacao, String labelPontuacao) {
        this.imagem = imagem;
        this.favorito = favorito;
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontuacao = pontuacao;
        this.labelPontuacao = labelPontuacao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getLabelPontuacao() {
        return labelPontuacao;
    }

    public void setLabelPontuacao(String labelPontuacao) {
        this.labelPontuacao = labelPontuacao;
    }
}
