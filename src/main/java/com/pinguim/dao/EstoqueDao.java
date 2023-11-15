package com.pinguim.dao;

import com.pinguim.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueDao extends JpaRepository<Estoque, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}
