package com.pinguim.gerenciamentoprodutos.service;

import com.pinguim.gerenciamentoprodutos.entity.Usuario;
import com.pinguim.gerenciamentoprodutos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioDao;

    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAll();
    }

    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioDao.findById(id);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    public void editarUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    public void excluirUsuario(Long id) {
        usuarioDao.deleteById(id);
    }
}

