package com.ranyele.recyclerinsiderecycler.model;

/**
 * Created by ranyeleamorim on 13/11/17.
 */

public class MainList {

    private String titulo;
    private java.util.List<CarouselList> listaItemCarrossel;

    public MainList(String titulo, java.util.List<CarouselList> listaItemCarrossel) {
        this.titulo = titulo;
        this.listaItemCarrossel = listaItemCarrossel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public java.util.List<CarouselList> getListaItemCarrossel() {
        return listaItemCarrossel;
    }

    public void setListaItemCarrossel(java.util.List<CarouselList> listaItemCarrossel) {
        this.listaItemCarrossel = listaItemCarrossel;
    }
}
