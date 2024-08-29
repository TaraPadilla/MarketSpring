package com.alianzaf1.market.persistence.repository;

import com.alianzaf1.market.persistence.entity.MKServicios.Caracteristica;
import org.springframework.data.repository.CrudRepository;

public interface CaracteristicaCrudRepository
        extends CrudRepository<Caracteristica,Integer> {
}
