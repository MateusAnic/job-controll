package com.dio.live.model;

import java.util.Objects;

public class Ocorrencia {
    private long id;
    private String nome;
    private String descricao;

    public Ocorrencia(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Ocorrencia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ocorrencia that = (Ocorrencia) o;
        return id == that.id && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
}

