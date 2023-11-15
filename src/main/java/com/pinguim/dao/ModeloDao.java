package com.pinguim.dao;

import com.pinguim.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloDao extends JpaRepository<Modelo, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}