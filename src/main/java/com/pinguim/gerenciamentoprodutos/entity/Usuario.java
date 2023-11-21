package com.pinguim.gerenciamentoprodutos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    private String setor;
    @Column
    private String email;
    @Column
    private String senha;
    @Column
    private boolean status;
    @Column
    private boolean usuarioAdm;

    public Usuario(){

    }
    public Usuario(long id, String nome, String email, String senha, boolean status, boolean usuarioAdm) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.email = email;
        this.senha = senha;
        this.status = status;
        this.usuarioAdm = usuarioAdm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() { return setor; }

    public void setSetor(String setor) { this.setor = setor; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getUsuarioAdm() {
        return usuarioAdm;
    }

    public void setUsuarioAdm(boolean usuarioAdm) {
        this.usuarioAdm = usuarioAdm;
    }

    @Override
    public String toString() {
        return "Usuario[id"+id
                +", nome"+nome
                +", setor"+setor
                +", email"+email
                +", senha"+senha
                +", status"+status
                +", usuarioAdm"+usuarioAdm
                +"]";
    }
}