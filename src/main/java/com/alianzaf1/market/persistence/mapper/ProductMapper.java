package com.alianzaf1.market.persistence.mapper;

import com.alianzaf1.market.domain.Product;
import com.alianzaf1.market.persistence.entity.MKProductos.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "categoria", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
