package com.pinguim.gerenciamentoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pinguim.gerenciamentoprodutos.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
