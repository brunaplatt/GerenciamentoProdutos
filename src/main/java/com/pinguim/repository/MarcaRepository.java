package com.pinguim.repository;

import com.pinguim.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    // Outros métodos específicos, se necessário
}

