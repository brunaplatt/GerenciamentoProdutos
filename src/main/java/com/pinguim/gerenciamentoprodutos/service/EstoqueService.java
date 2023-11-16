package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Estoque;
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

    public void cadastrarEstoque(Estoque estoque) {
        estoqueRepository.save(estoque);
    }

    public void excluirEstoque(Long estoqueId) {
        estoqueRepository.deleteById(estoqueId);
    }

}
