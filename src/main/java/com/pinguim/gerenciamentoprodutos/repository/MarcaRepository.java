package com.pinguim.gerenciamentoprodutos.repository;

import com.pinguim.gerenciamentoprodutos.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}

