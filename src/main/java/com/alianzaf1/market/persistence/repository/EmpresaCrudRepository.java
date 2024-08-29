package com.alianzaf1.market.persistence.repository;

import com.alianzaf1.market.persistence.entity.MKBases.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaCrudRepository extends CrudRepository<Empresa, Integer> {
}
