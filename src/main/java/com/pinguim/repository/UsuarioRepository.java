package com.pinguim.repository;

import com.pinguim.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Outros métodos específicos, se necessário
}
