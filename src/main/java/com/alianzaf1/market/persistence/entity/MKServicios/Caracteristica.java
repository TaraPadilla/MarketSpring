package com.alianzaf1.market.persistence.entity.MKServicios;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "caracteristica", schema = "services")
@Getter
@Setter
@NoArgsConstructor
public class Caracteristica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caracteristica", nullable = false)
    private Integer idCaracteristica;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String descripcion;
}
