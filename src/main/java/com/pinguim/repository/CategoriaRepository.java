package com.pinguim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pinguim.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
