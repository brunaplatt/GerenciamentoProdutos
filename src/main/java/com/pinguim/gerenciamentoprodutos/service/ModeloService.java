package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Modelo;
import com.pinguim.gerenciamentoprodutos.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {
    @Autowired
    private ModeloRepository modeloDao;

    public List<Modelo> listarModelos() {
        return modeloDao.findAll();
    }

    public void cadastrarModelo(Modelo modelo) {
        modeloDao.save(modelo);
    }

    public void excluirModelo(Long modeloId) {
        modeloDao.deleteById(modeloId);
    }

    // Adicione outros métodos conforme necessário para a lógica de negócios relacionada a modelos
}
