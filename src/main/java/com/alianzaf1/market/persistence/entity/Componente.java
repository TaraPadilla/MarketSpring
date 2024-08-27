package com.alianzaf1.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="componente", schema = "services")
@Getter
@Setter
@NoArgsConstructor
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_componente", nullable = false)
    private Integer idComponente;

    @Column(nullable = false, length = 255)
    private String descripcion;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false)
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_servicio", nullable = true)
    private Servicio servicio;

}

