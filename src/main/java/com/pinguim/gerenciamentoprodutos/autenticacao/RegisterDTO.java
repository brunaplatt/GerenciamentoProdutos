package com.pinguim.gerenciamentoprodutos.autenticacao;

public record RegisterDTO(String login, String password, UsuarioRole role) {
}
