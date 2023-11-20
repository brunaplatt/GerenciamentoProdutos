package com.pinguim.gerenciamentoprodutos.autenticacao;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public interface UsuarioDetails {
    Collection<? extends GrantedAuthority> getAuthorities();

    String getUsername();

    boolean isAccountNonExpired();

    boolean isAccountNonLocked();

    boolean isCredentialsNonExpired();

    boolean isEnabled();
}
