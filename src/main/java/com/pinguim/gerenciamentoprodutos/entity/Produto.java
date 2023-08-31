package com.pinguim.gerenciamentoprodutos.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    private int codigo;
    private String categoria;
    private String modelo;
    private int ano;
    private String fabricante;
    private int voltagem;
    private int litros;
    private String cor;
    private Double preco;
}
