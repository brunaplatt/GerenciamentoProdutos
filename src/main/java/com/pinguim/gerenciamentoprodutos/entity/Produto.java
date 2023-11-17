package com.pinguim.gerenciamentoprodutos.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column
    private String nome;
    @Column
    private String categoria;
    @Column
    private String modelo;
    @Column
    private Integer ano;
    @Column
    private String fabricante;
    @Column
    private Integer voltagem;
    @Column
    private Integer litros;
    @Column
    private String cor;
    @Column
    private Double preco;

    @Column
    private Integer ativo;

    public Produto(){

    }

    public Produto(String produto){ this.nome = produto; }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setLitros(Integer litros) {
        this.litros = litros;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setVoltagem(Integer voltagem) {
        this.voltagem = voltagem;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCor() {
        return cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public Integer getAno() {
        return ano;
    }
    public Integer getLitros() {
        return litros;
    }

    public Integer getAtivo() {
        return ativo;
    }

    @Override
    public String toString(){
        return "Produto [codigo="+codigo
                +", nome"+nome
                +", categoria"+categoria
                +", modelo"+modelo
                +", ano"+ano
                +", fabricante"+fabricante
                +", voltagem"+voltagem
                +", litros"+litros
                +", cor"+cor
                +", preco"+preco
                +", ativo"+ativo
                +"]";
    }
}