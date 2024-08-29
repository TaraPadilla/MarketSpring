package com.alianzaf1.market.persistence.entity.MKComercial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServicioCotizacionPK implements Serializable {
    private Integer idServicio;
    private Integer idCotizacion;


}
