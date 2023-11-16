package com.pinguim.gerenciamentoprodutos.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long id_produto;
    @Column
    private int quantidade;

    public Estoque(){

    }
    public Estoque(Long id, int quantidade, Long id_produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.id_produto = id_produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade;}
    @Override
    public String toString() {
        return "Estoque[" +
                "id" + id +
                ", quantidade" + quantidade +
                ", id_produto=" + id_produto +
                ']';
    }
}

