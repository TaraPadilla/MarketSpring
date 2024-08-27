package com.alianzaf1.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cotizacion",  schema = "comercial")
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotizacion", nullable = false)
    private Integer idCotizacion;

    @Column(nullable = false, length = 255)
    private String estado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(nullable = true, length = 255)
    private String notas;

    @Column(name = "precio_total", nullable = false)
    private Double precioTotal;

    @ManyToOne
    @JoinColumn(name = "id_catalogo", nullable = true)
    private Catalogo catalogo;

    @ManyToOne
    @JoinColumn(name = "id_servicio", nullable = true)
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = true)
    private Usuario usuario;


}
