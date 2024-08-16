package com.alianzaf1.market.domain.repository;

import com.alianzaf1.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
   List<Producto> getAll();
   Optional<List<Producto>> getByCategoria(int categoryId);
   Optional<List<Producto>> getScarseProducts(int quantity);
   Optional<Producto> getProducto(int idProducto);
   public Producto save(Producto producto);
}
