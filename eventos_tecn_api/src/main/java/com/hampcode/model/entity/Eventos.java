package com.hampcode.model.entity;

import com.hampcode.model.enums.TipoEvento;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.time.LocalDateTime;

@Data
@Entity
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String titulo;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descripcion;

    @Column(nullable = false, length = 255)
    private String ubicacion;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;

    @ManyToOne
    @JoinColumn(name = "organizador_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_organizador_id"))
    private Usuarios organizador;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Inscripciones> inscripciones;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Pagos> pagos;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Reportes> reportes;
}
