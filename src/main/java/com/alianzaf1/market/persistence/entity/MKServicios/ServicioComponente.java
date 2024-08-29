package com.alianzaf1.market.persistence.entity.MKServicios;


import jakarta.persistence.*;

@Entity
@Table(name = "servicio_componente")
public class ServicioComponente {

    @Id
    @Column(name="id_servicio_componente",nullable = false)
    private Integer idServicioComponente;

    @Column(name="id_servicio",nullable = false)
    private Integer idServicio;

    @Column(name="id_componente",nullable = false)
    private Integer idComponente;

    @ManyToOne
    @JoinColumn(name = "id_servicio",updatable = false, insertable = false)
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_componente", updatable = false, insertable = false)
    private Componente componente;

}
