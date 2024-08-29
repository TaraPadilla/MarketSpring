package com.alianzaf1.market.persistence.entity.MKServicios;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "servicio_caracteristica", schema = "services")

public class ServicioCaracteristica {

    @EmbeddedId
    private ServicioCaracteristicaPK id;

    @Column(nullable = false)
    private Integer cantidad;

    @ManyToOne
    @MapsId("idServicio")
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    private Servicio servicio;

    @ManyToOne
    @MapsId("idCaracterstica")
    @JoinColumn(name = "id_caracteristica",referencedColumnName = "id_caracteristica")
    private Caracteristica caracteristica;
}
