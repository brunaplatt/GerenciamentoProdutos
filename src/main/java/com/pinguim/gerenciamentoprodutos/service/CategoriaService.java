package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.dao.CategoriaDao;
import com.pinguim.gerenciamentoprodutos.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaDao categoriaDao;

    public List<Categoria> listarCategorias() {
        return categoriaDao.findAll();
    }

    public Categoria cadastrarCategoria(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    public void excluirCategoria(Long categoriaId) {
        categoriaDao.deleteById(categoriaId);
    }

    // Adicione outros métodos conforme necessário para a lógica de negócios relacionada a categorias
}
