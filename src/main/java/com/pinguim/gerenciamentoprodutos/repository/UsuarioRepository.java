package com.pinguim.gerenciamentoprodutos.repository;

import com.pinguim.gerenciamentoprodutos.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    UserDetails findByLogin(String login);

    @Query("Select k from Usuario k where k.nome like ?1")
    List<Usuario> buscaPorNome(String nome);
}
