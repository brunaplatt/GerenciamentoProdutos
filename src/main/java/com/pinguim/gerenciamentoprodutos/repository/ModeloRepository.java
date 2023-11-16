package com.pinguim.gerenciamentoprodutos.repository;

import com.pinguim.gerenciamentoprodutos.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    @Query("Select k from Produto k where k.nome like ?1")
    List<Modelo> buscaPorNome(String nome);
}
