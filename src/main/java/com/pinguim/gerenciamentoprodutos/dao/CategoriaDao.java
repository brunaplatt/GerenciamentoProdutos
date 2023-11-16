package com.pinguim.gerenciamentoprodutos.dao;

import com.pinguim.gerenciamentoprodutos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}
