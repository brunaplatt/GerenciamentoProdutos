package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import com.pinguim.gerenciamentoprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoDao;

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

    public List<Produto> gerarRelatorio(String atributo) {
        return produtoDao.findAll();
    }
}





