package com.alurachallenge.forohub.forohub.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table
@EqualsAndHashCode(of = "id")
@Data
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private boolean estado;
    private String curso;
    private LocalDate creado;

    @ManyToOne
    @JoinColumn(name = "usarioId", nullable = false)
    private Usuario usuario;

    public Topico(String titulo, String mensaje, String curso, Usuario usuario) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.estado = true;
        this.curso = curso;
        this.usuario = usuario;
        this.creado = LocalDate.now();

    }

    public Topico() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long topicId) {
        this.id = topicId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMessage() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getCreado() {
        return creado;
    }

    public void setCreado(LocalDate creado) {
        this.creado = creado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
