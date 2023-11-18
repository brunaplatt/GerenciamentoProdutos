package com.pinguim.gerenciamentoprodutos.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_produto")
    private Produto idProduto;
    @Column
    private int quantidade;

    public Estoque(){

    }
    public Estoque(Long id, int quantidade, Produto idProduto) {
        this.id = id;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
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

    public void setIdProduto(Produto produto) { this.idProduto = produto;}

    public Produto getIdProduto(){return idProduto;}

    @Override
    public String toString() {
        return "Estoque[" +
                "id" + id +
                ", quantidade" + quantidade +
                ", idProduto" + idProduto +
                ']';
    }
}

