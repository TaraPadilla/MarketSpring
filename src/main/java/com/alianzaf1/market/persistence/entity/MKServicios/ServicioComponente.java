package com.alianzaf1.market.persistence.entity.MKServicios;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "servicio_componente")
@Getter
@Setter
@NoArgsConstructor
public class ServicioComponente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
