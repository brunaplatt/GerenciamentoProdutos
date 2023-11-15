package com.pinguim.service;

import com.pinguim.dao.ModeloDao;
import com.pinguim.entity.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {
    @Autowired
    private ModeloDao modeloDao;

    public List<Modelo> listarModelos() {
        return modeloDao.findAll();
    }

    public Modelo cadastrarModelo(Modelo modelo) {
        return modeloDao.save(modelo);
    }

    public void excluirModelo(Long modeloId) {
        modeloDao.deleteById(modeloId);
    }

    // Adicione outros métodos conforme necessário para a lógica de negócios relacionada a modelos
}
