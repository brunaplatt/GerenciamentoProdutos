package com.pinguim.service;

import com.pinguim.dao.ProdutoDao;
import com.pinguim.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoDao produtoDao;

    public List<Produto> listarProdutos() {
        return produtoDao.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(Long id) {
        return produtoDao.findById(id);
    }

    public void cadastrarProduto(Produto produto) {
        produtoDao.save(produto);
    }

    public void editarProduto(Produto produto) {
        produtoDao.save(produto);
    }

    public void excluirProduto(Long id) {
        produtoDao.deleteById(id);
    }
}
