package com.pinguim.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Produto {
    public enum StatusProduto {
        ATIVO, INATIVO
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private StatusProduto status;
    private long id;
    private String nome;

    @Getter
    private String cor;
    private double preco;
    private Estoque estoque;
    private Marca marca;
    private Categoria categoria;
    private Modelo modelo;

    public Produto() {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.estoque = estoque;
        this.marca = marca;
        this.categoria = categoria;
        this.modelo = modelo;
    }

    @Enumerated(EnumType.STRING)
    private StatusProduto statusProduto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public StatusProduto getStatus() {
        return this.status;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                ", status=" + statusProduto +
                ", estoque=" + estoque +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", modelo=" + modelo +
                '}';
    }
}
