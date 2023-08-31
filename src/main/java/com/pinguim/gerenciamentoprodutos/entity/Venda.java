package com.pinguim.gerenciamentoprodutos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Venda {
    int codigo;
    LocalDateTime data;
    String cliente;
    String cnpj;
    Double pagamento;
    Produto produto;
}
