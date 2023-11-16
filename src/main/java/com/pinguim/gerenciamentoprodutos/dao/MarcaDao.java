package com.pinguim.gerenciamentoprodutos.dao;

import com.pinguim.gerenciamentoprodutos.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaDao extends JpaRepository<Marca, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}
