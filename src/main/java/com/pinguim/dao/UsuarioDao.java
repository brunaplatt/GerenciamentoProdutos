package com.pinguim.dao;

import com.pinguim.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    // Você pode adicionar métodos personalizados de consulta, se necessário
}
