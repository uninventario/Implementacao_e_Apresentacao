package com.uninventario.uninventario.domain.laboratorio;

public class Laboratorio {
    private Integer id;
    private String nome;
    private String predio;
    private Integer andar;

    public Laboratorio(Integer id, String nome, String predio, Integer andar) {
        this.id = id;
        this.nome = nome;
        this.predio = predio;
        this.andar = andar;
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

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }
}