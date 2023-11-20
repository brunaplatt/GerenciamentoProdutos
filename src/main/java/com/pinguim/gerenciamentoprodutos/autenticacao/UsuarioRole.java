package com.pinguim.gerenciamentoprodutos.autenticacao;

public enum UsuarioRole {
    ADMIN("admin");

   USUARIO("usuario");

    private String role;

    UsuarioRole(String role) {
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}

