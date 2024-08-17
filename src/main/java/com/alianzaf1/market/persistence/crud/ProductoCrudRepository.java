package com.alianzaf1.market.persistence.crud;

import com.alianzaf1.market.persistence.ProductoRepository;
import com.alianzaf1.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>
{
    //Query Nativo
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    //Query Method
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    List<Producto> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
