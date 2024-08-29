package com.alianzaf1.market.persistence.entity.MKServicios;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class ServicioCaracteristicaPK implements Serializable {

    private Integer idServicio;
    private Integer idCaracterstica;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicioCaracteristicaPK that = (ServicioCaracteristicaPK) o;
        return Objects.equals(idServicio, that.idServicio) && Objects.equals(idCaracterstica, that.idCaracterstica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicio, idCaracterstica);
    }
}
