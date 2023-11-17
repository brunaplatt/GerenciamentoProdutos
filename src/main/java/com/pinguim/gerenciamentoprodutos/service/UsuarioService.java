package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Usuario;
import com.pinguim.gerenciamentoprodutos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }
    public void cadastrarUsuario(Usuario usuario) {

        usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarUsuarioPorId(Long id) {

        return usuarioRepository.findById(id);
    }

    public void editarUsuario(Usuario usuario) {

        usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {

        return usuarioRepository.findAll();
    }

    public void excluirUsuario(Long id) {

        usuarioRepository.deleteById(id);
    }
}

