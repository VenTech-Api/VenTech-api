package com.hampcode.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String contraseña;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Perfiles perfil;

    @OneToMany(mappedBy = "organizador", cascade = CascadeType.ALL)
    private List<Eventos> eventosOrganizados;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Inscripciones> inscripciones;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Pagos> pagos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Reportes> reportes;
}
