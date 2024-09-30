package com.hampcode.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Perfiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String interesesTecnologicos;

    @Column(columnDefinition = "TEXT")
    private String habilidades;

    @Column(length = 255)
    private String linkedin;

    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_usuario_id"))
    private Usuarios usuario;
}
