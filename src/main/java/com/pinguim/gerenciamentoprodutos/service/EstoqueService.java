package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Estoque;
import com.pinguim.gerenciamentoprodutos.entity.Produto;
import com.pinguim.gerenciamentoprodutos.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;

    public List<Estoque> listarEstoques() {
        return estoqueRepository.findAll();
    }

    public List<Estoque> buscaEstoqueComNomeProduto() {
        return estoqueRepository.buscaEstoqueComNomeProduto();
    }

    public void cadastrarEstoque(Estoque estoque) {
        estoqueRepository.save(estoque);
    }

    public void excluirEstoque(Long estoqueId) {
        estoqueRepository.deleteById(estoqueId);
    }

    public Estoque buscarEstoquePorId(Long id) {
        return estoqueRepository.findById(id).get();
    }

    public void editarEstoque(Estoque estoque) {
        estoqueRepository.save(estoque);
    }

}
