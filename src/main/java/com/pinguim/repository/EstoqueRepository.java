package com.pinguim.repository;

import com.pinguim.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    // Outros métodos específicos, se necessário
}

