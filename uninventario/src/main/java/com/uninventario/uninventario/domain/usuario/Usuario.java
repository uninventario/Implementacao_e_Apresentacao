package com.uninventario.uninventario.domain.usuario;

public class Usuario {

    public Integer id;
    public String nome;
    public String cargo;
    public Integer matricula;

    public Usuario(Integer id, String nome, String cargo, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

}
