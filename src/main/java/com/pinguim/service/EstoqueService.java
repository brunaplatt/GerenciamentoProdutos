package com.pinguim.service;

import com.pinguim.dao.EstoqueDao;
import com.pinguim.entity.Estoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueDao estoqueDao;

    public List<Estoque> listarEstoques() {
        return estoqueDao.findAll();
    }

    public Estoque cadastrarEstoque(Estoque estoque) {
        return estoqueDao.save(estoque);
    }

    public void excluirEstoque(Long estoqueId) {
        estoqueDao.deleteById(estoqueId);
    }

}
