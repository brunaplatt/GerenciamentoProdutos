package com.pinguim.gerenciamentoprodutos.repository;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("Select k from Produto k where k.nome like ?1")
    List<Produto> buscaPorNome(String nome);

    @Query("Select k from Produto k where k.fabricante like ?1")
    List<Produto> buscaPorFabricante(String fabricante);

    @Query("Select k from Produto k where k.ativo = 1")
    List<Produto> buscarAtivos();

    @Query(value = "Select count(*) from Produto", nativeQuery = true)
    Integer countProduto();

    @Query(value = "Select * from Produto", nativeQuery = true)
    List<Produto> buscaPorNomeNativo(String nome);

}