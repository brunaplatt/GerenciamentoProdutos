package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoController {
    private List<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        // Verifica se um produto idêntico já existe na lista
        List<Produto> produtosIdenticos = produtos.stream()
                .filter(p -> saoProdutosIdenticos(p, produto))
                .collect(Collectors.toList());

        if (!produtosIdenticos.isEmpty()) {
            // Se já existir, soma a quantidade ao produto existente
            Produto produtoExistente = produtosIdenticos.get(0);
            produtoExistente.getEstoque().somarQuantidadeProdutos(produto.getEstoque().getQuantidadeProdutos());
        } else {
            // Se não existir, adiciona o novo produto à lista
            produtos.add(produto);
        }
    }

    public void editarProduto(Produto produto) {
        // Implemente a lógica para editar um produto, considerando a soma de quantidade
        // Pode ser necessário remover o produto antigo e cadastrar o novo
    }

    public void excluirProduto(long produtoId) {
        produtos.removeIf(p -> p.getId() == produtoId);
    }

    // Método verificar se dois produtos são idênticos
    private boolean saoProdutosIdenticos(Produto produto1, Produto produto2) {
        return produto1.getCategoria().equals(produto2.getCategoria()) &&
                produto1.getModelo().equals(produto2.getModelo()) &&
                produto1.getMarca().equals(produto2.getMarca()) &&
                produto1.getCor().equals(produto2.getCor());
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();

        // cadastro de produtos
        Produto produto1 = new Produto(/* ... preencha os atributos ... */);
        produtoController.cadastrarProduto(produto1);

        Produto produto2 = new Produto(/* ... preencha os atributos ... */);
        produtoController.cadastrarProduto(produto2);

        // listagem de produtos
        List<Produto> listaProdutos = produtoController.listarProdutos();
        System.out.println("Lista de Produtos:");
        listaProdutos.forEach(System.out::println);

        // exclusão de produto
        produtoController.excluirProduto(produto1.getId());
    }
}
