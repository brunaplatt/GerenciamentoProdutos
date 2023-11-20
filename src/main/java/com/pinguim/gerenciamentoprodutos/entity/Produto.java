package com.pinguim.gerenciamentoprodutos.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "produto")
@Entity(name = "produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
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
    private Integer preco;
    @Column
    private Boolean status;

    public String toString(String nome, String modelo, Integer ano, String fabricante, Integer voltagem, Integer litros, String cor, Integer preco, Boolean  status){
        return "Produto [id"+id
                +", nome"+nome
                +", categoria"+categoria
                +", modelo"+modelo
                +", ano"+ano
                +", fabricante"+fabricante
                +", voltagem"+voltagem
                +", litros"+litros
                +", cor"+cor
                +", preco"+preco
                +", status"+status
                +"]";
    }
}

