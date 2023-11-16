package com.pinguim.gerenciamentoprodutos.controller;


import com.pinguim.gerenciamentoprodutos.entity.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaController {
    private List<Categoria> categorias;

    public CategoriaController() {
        this.categorias = new ArrayList<>();
    }

    // Cadastro de categoria
    public void cadastrarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    // Edição de categoria
    public void editarCategoria(Categoria categoria) {
        // Implementar lógica de edição (pode envolver buscar a categoria no banco de dados)
        // Exemplo: categorias.set(index, categoria);
    }

    // Exclusão de categoria
    public void excluirCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }

    // Listagem de categorias
    public List<Categoria> listarCategorias() {
        return categorias;
    }

    // Geração de relatório de categorias
    public void gerarRelatorioCategorias() {
        System.out.println("Relatório de Categorias:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria.toString());
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do CategoriaController
        CategoriaController categoriaController = new CategoriaController();

        // Cadastro de categorias
        Categoria categoria1 = new Categoria(1, "Eletrodoméstico");
        Categoria categoria2 = new Categoria(2, "Eletrônicos");

        categoriaController.cadastrarCategoria(categoria1);
        categoriaController.cadastrarCategoria(categoria2);

        // Listagem de categorias
        List<Categoria> categoriasCadastradas = categoriaController.listarCategorias();
        System.out.println("Categorias Cadastradas:");
        for (Categoria categoria : categoriasCadastradas) {
            System.out.println(categoria.toString());
        }

        // Edição de categoria
        categoria1.setNome("Eletrodomésticos");
        categoriaController.editarCategoria(categoria1);

        // Exclusão de categoria
        categoriaController.excluirCategoria(categoria2);

        // Listagem atualizada de categorias
        categoriasCadastradas = categoriaController.listarCategorias();
        System.out.println("Categorias Atualizadas:");
        for (Categoria categoria : categoriasCadastradas) {
            System.out.println(categoria.toString());
        }

        // Geração de relatório de categorias
        categoriaController.gerarRelatorioCategorias();
    }
}

