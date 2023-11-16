package com.pinguim.gerenciamentoprodutos.repository;

import com.pinguim.gerenciamentoprodutos.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    // Outros métodos específicos, se necessário
}
