package com.alianzaf1.market.persistence.entity.MKComercial;

import com.alianzaf1.market.persistence.entity.MKServicios.Servicio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="servicio_cotizacion")
@IdClass(ServicioCotizacionPK.class)
@Getter
@Setter
@NoArgsConstructor
public class ServicioCotizacion {

    @Id
    @Column(name = "id_servicio")
    private Integer idServicio;

    @Id
    @Column(name = "id_cotizacion")
    private Integer idCotizacion;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precioItem;

    @ManyToOne
    @JoinColumn(name = "id_servicio",referencedColumnName = "id_servicio",
                insertable = false, updatable = false)
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_cotizacion", referencedColumnName = "id_cotizacion",
                insertable = false, updatable = false)
    private Cotizacion cotizacion;
}
