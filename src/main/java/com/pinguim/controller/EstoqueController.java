package com.pinguim.controller;

import com.pinguim.entity.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstoqueController {
    private List<Produto> produtos;

    public EstoqueController(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public List<Produto> filtrarPorStatus(Produto.StatusProduto status) {
        return produtos.stream()
                .filter(produto -> produto.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<Produto> filtrarPorPreco(double precoMin, double precoMax) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMin && produto.getPreco() <= precoMax)
                .collect(Collectors.toList());
    }

    // Adicione métodos semelhantes para outros atributos como modelo, categoria, marca, cor, etc.

    public void gerarRelatorioPorAtributo(String atributo) {
        // Implemente a lógica para gerar relatório com base em um atributo específico
        // Pode ser algo como percorrer a lista de produtos e imprimir o valor do atributo desejado
    }

    public static void main(String[] args) {
        // uso do EstoqueController
        List<Produto> produtos = new ArrayList<>();
                EstoqueController estoqueController = new EstoqueController(produtos);

        // Listagem de produtos
        List<Produto> listaProdutos = estoqueController.listarProdutos();
        System.out.println("Lista de Produtos:");
        listaProdutos.forEach(System.out::println);

        // Filtragem por status
        List<Produto> produtosAtivos = estoqueController.filtrarPorStatus(Produto.StatusProduto.ATIVO);
        System.out.println("\nProdutos Ativos:");
        produtosAtivos.forEach(System.out::println);

        // Filtragem por preço
        List<Produto> produtosEntre50e100 = estoqueController.filtrarPorPreco(50, 100);
        System.out.println("\nProdutos entre R$50 e R$100:");
        produtosEntre50e100.forEach(System.out::println);

        // Geração de relatório por atributo
        estoqueController.gerarRelatorioPorAtributo("modelo");
    }
}
