package com.pinguim.gerenciamentoprodutos.dao;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}