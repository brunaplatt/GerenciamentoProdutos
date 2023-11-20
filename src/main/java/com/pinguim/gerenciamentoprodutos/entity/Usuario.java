package com.pinguim.gerenciamentoprodutos.entity;

import com.pinguim.gerenciamentoprodutos.autenticacao.UsuarioDetails;
import com.pinguim.gerenciamentoprodutos.autenticacao.UsuarioRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collection;
import java.util.List;

@Table(name = "users")
@Entity(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public final class Usuario implements UsuarioDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column
    private String nome;
    @Column
    private String setor;
    @Column
    private String email;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private boolean status;
    @Column
    private UsuarioRole role;

    public Usuario(String nome, String setor, String email, String login, String password, Boolean status, UsuarioRole role) {
        this.nome = nome;
        this.setor = setor;
        this.email = email;
        this.login = login;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public Usuario(String login, String encryptedPassword, UsuarioRole role) {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UsuarioRole.ADMIN)
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USUARIO"));
        else return List.of(new SimpleGrantedAuthority("ROLE_USUARIO"));
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

