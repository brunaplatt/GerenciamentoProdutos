package com.pinguim.gerenciamentoprodutos.entity;

import jakarta.persistence.*;

@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String fabricante;
    public Marca(){

    }
    public Marca(Long id, String fabricante) {
        this.id = id;
        this.fabricante = fabricante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "Marca[" +
                "id" + id +
                ", fabricante" + fabricante +
                ']';
    }
}