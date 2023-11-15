package com.pinguim.repository;

import com.pinguim.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    // Outros métodos específicos, se necessário
}
