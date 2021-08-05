package com.dio.live.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {
    private long id;
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    private Empresa empresa;
    private NivelAcesso nivelAcesso;
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

    public Usuario(long id) {
        this.id = id;
    }

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario that = (Usuario) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
