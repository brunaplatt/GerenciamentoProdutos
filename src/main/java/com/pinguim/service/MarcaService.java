package com.pinguim.service;

import com.pinguim.dao.MarcaDao;
import com.pinguim.entity.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaDao marcaDao;

    public List<Marca> listarMarcas() {
        return marcaDao.findAll();
    }

    public Marca cadastrarMarca(Marca marca) {
        return marcaDao.save(marca);
    }

    public void excluirMarca(Long marcaId) {
        marcaDao.deleteById(marcaId);
    }

    // Adicione outros métodos conforme necessário para a lógica de negócios relacionada a marcas
}
