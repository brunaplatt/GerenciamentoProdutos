package com.pinguim.gerenciamentoprodutos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    int codigo;
    String nome;
    String senha;
    int cpf;
}
