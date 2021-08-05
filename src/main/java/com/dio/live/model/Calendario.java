package com.dio.live.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Calendario {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;


    public Calendario(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Calendario() {
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
        Calendario that = (Calendario) o;
        return id == that.id && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
}

