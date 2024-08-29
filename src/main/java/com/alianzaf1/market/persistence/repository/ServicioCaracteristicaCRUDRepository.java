package com.alianzaf1.market.persistence.repository;

import com.alianzaf1.market.persistence.entity.MKServicios.ServicioCaracteristica;
import org.springframework.data.repository.CrudRepository;

public interface ServicioCaracteristicaCRUDRepository
        extends CrudRepository<ServicioCaracteristica, Integer > {
}
