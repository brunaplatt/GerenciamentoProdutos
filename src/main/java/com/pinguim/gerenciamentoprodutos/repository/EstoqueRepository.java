package com.pinguim.gerenciamentoprodutos.repository;

import com.pinguim.gerenciamentoprodutos.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    @Query(value = "Select * from Estoque", nativeQuery = true)
    List<Estoque> buscaEstoque();

    @Query(value = "Select e.*, p.nome from Estoque e INNER JOIN Produto p ON p.id = e.id_produto", nativeQuery = true)
    List<Estoque> buscaEstoqueComNomeProduto();
}

