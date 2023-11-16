package com.pinguim.gerenciamentoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pinguim.gerenciamentoprodutos.entity.Categoria;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Query("Select k from Categoria k where k.nome like ?1")
    List<Categoria> buscaPorNome(String nome);
}
