package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Marca;
import com.pinguim.gerenciamentoprodutos.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaDao;

    public List<Marca> listarMarcas() {
        return marcaDao.findAll();
    }

    public void cadastrarMarca(Marca marca) {
        marcaDao.save(marca);
    }

    public void excluirMarca(Long marcaId) {
        marcaDao.deleteById(marcaId);
    }

    // Adicione outros métodos conforme necessário para a lógica de negócios relacionada a marcas
}
