package com.alianzaf1.market.persistence.entity.MKComercial;

import com.alianzaf1.market.persistence.entity.MKServicios.Componente;
import com.alianzaf1.market.persistence.entity.MKServicios.ServicioComponente;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
class CotizacionComponentePK implements Serializable{

    private Integer idCotizacion;
    private Integer idComponente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CotizacionComponentePK that = (CotizacionComponentePK) o;
        return Objects.equals(idCotizacion, that.idCotizacion) && Objects.equals(idComponente, that.idComponente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCotizacion, idComponente);
    }
}


@Entity
@Table(name = "componente_cotizacion_item")
@Getter
@Setter
@NoArgsConstructor
public class ComponenteCotizacion {

    @EmbeddedId
    private CotizacionComponentePK idCotizacionPK;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precio;

    @ManyToOne
    @MapsId("idCotizacion")
    @JoinColumn(name = "id_cotizacion",nullable = false,
            insertable = false,updatable = false)
    private Cotizacion cotizacion;

    @ManyToOne
    @MapsId("idComponente")
    @JoinColumn(name = "id_componente",
            referencedColumnName = "id_servicio_componente",
            nullable = false, insertable = false, updatable = false)
    private ServicioComponente componente;
}
