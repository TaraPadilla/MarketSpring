package com.alianzaf1.market.persistence.entity.MKComercial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServicioCotizacionPK implements Serializable {
    private Integer idServicio;
    private Integer idCotizacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicioCotizacionPK that = (ServicioCotizacionPK) o;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idCotizacion, that.idCotizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicio, idCotizacion);
    }
}
