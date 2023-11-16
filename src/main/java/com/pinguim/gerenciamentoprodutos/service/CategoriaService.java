package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Categoria;
import com.pinguim.gerenciamentoprodutos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaDao;

    public List<Categoria> listarCategorias() {
        return categoriaDao.findAll();
    }

    public void cadastrarCategoria(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    public void excluirCategoria(Long categoriaId) {
        categoriaDao.deleteById(categoriaId);
    }

    // Adicione outros métodos conforme necessário para a lógica de negócios relacionada a categorias
}
