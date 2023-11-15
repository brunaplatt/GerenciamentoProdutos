package com.pinguim.entity;

public class Marca {
    private long id;
    private String fabricante;

    public Marca(long id, String fabricante) {
        this.id = id;
        this.fabricante = fabricante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}