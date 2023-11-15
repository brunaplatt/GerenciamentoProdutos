package com.pinguim.dao;

import com.pinguim.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}
