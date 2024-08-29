package com.alianzaf1.market.persistence.repository;

import com.alianzaf1.market.persistence.entity.MKBases.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario,Integer> {
}
