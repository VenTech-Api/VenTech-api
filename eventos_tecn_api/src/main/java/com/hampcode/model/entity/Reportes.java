package com.hampcode.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Reportes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_usuario_id"))
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name = "evento_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_evento_id"))
    private Eventos evento;

    @Column(nullable = false, length = 255)
    private String tipo;

    @Column(columnDefinition = "TEXT")
    private String contenido;
}
