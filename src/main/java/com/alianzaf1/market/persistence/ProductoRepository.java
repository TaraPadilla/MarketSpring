package com.alianzaf1.market.persistence;
import com.alianzaf1.market.domain.Product;
import com.alianzaf1.market.domain.repository.ProductRepository;
import com.alianzaf1.market.persistence.crud.ProductoCrudRepository;
import com.alianzaf1.market.persistence.entity.Producto;
import com.alianzaf1.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;
    private List<Producto> productos;

    public List<Product> getAll(){
        productos =  (List<Producto>) productoCrudRepository.findAll();
        return  mapper.toProducts(productos);
    }

    public List<Product> getByCategoria(int idCategoria) {
        productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
        return mapper.toProducts(productos);
    }

    public List<Product> getScarseProducts(int cantidad){
        productos = productoCrudRepository.
                    findByCantidadStockLessThanAndEstado(cantidad, true);
        return mapper.toProducts(productos);
    }

    public Optional<Product> getProduct(int idProducto){
        return productoCrudRepository.
                    findById(idProducto).map(producto -> mapper.toProduct(producto));
    }

    public Product save(Product product) {
        Producto producto = productoCrudRepository.
                save(mapper.toProducto(product));
        return mapper.toProduct(producto);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
