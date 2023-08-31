package com.pinguim.gerenciamentoprodutos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    int codigo;
    String nome;
    int documento;
    String endereco;
    String telefone;
}
