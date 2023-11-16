package com.pinguim.gerenciamentoprodutos.dao;

import com.pinguim.gerenciamentoprodutos.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloDao extends JpaRepository<Modelo, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}
