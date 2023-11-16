package com.pinguim.gerenciamentoprodutos.entity;

import jakarta.persistence.*;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String modelo;
    @Column
    private int anoFabricacao;
    @Column
    private String voltagem;
    @Column
    private int litros;
    public Modelo(){

    }
    public Modelo(Long id, String modelo, int anoFabricacao, String voltagem, int litros) {
        this.id = id;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.voltagem = voltagem;
        this.litros = litros;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
    @Override
    public String toString() {
        return "Modelo[" +
                "id" + id +
                ", modelo" + modelo +
                ", anoFabricacao" + anoFabricacao +
                ", voltagem" + voltagem  +
                ", litros" + litros +
                ']';
    }
}
