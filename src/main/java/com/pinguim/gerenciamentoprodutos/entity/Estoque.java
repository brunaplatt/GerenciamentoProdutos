package com.pinguim.gerenciamentoprodutos.entity;

import java.util.List;

public class Estoque {
    private int quantidade;
    private String id;
    private int quantidadeProdutos;
    private List<Long> idProdutos;
    private List<Produto> listaProdutos;

    public Estoque(String id, int quantidadeProdutos, List<Long> idProdutos, List<Produto> listaProdutos) {
        this.id = id;
        this.quantidadeProdutos = quantidadeProdutos;
        this.idProdutos = idProdutos;
        this.listaProdutos = listaProdutos;
    }

    public void somarQuantidadeProdutos(int quantidadeASomar) {
        this.quantidadeProdutos += quantidadeASomar;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public List<Long> getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(List<Long> idProdutos) {
        this.idProdutos = idProdutos;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "id='" + id + '\'' +
                ", quantidadeProdutos=" + quantidadeProdutos +
                ", idProdutos=" + idProdutos +
                ", listaProdutos=" + listaProdutos +
                '}';
    }
}

