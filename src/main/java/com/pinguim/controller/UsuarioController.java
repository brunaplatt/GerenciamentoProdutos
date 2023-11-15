package com.pinguim.controller;

import com.pinguim.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    // Cadastro de usuário
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Alteração de usuário
    public void alterarUsuario(Usuario usuario) {
    }

    // Exclusão de usuário
    public void excluirUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    // Criação de senha para usuário
    public void criarSenha(Usuario usuario, String novaSenha) {
        usuario.setSenha(novaSenha);
    }

    // Listagem de usuários
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    // Geração de relatório de usuários
    public void gerarRelatorioUsuarios() {
        System.out.println("Relatório de Usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do UserController
        UsuarioController userController = new UsuarioController();

        // Cadastro de usuários
        Usuario usuario1 = new Usuario(1, "João", "joao@email.com", "senha123", true, true);
        Usuario usuario2 = new Usuario(2, "Maria", "maria@email.com", "senha456", true, false);

        userController.cadastrarUsuario(usuario1);
        userController.cadastrarUsuario(usuario2);

        // Listagem de usuários
        List<Usuario> usuariosCadastrados = userController.listarUsuarios();
        System.out.println("Usuários Cadastrados:");
        for (Usuario usuario : usuariosCadastrados) {
            System.out.println(usuario.toString());
        }

        // Alteração de usuário
        usuario1.setNome("João da Silva");
        userController.alterarUsuario(usuario1);

        // Exclusão de usuário
        userController.excluirUsuario(usuario2);

        // Criação de senha
        userController.criarSenha(usuario1, "novaSenha789");

        // Listagem atualizada de usuários
        usuariosCadastrados = userController.listarUsuarios();
        System.out.println("Usuários Atualizados:");
        for (Usuario usuario : usuariosCadastrados) {
            System.out.println(usuario.toString());
        }

        // Geração de relatório de usuários
        userController.gerarRelatorioUsuarios();
    }
}
