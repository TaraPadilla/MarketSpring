package com.alianzaf1.market.persistence.mapper;

import com.alianzaf1.market.domain.PurchaseItem;
import com.alianzaf1.market.persistence.entity.Compra;
import com.alianzaf1.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")

public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "idComprasProductoPK.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "total", target = "total"),//No es necesario mapear porque se llaman igual
            @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mapping(target="compra",ignore = true)
    @Mapping(target="producto",ignore = true)
    @Mapping(target="idComprasProductoPK.idCompra",ignore = true)
    ComprasProducto toComprasProducto(PurchaseItem item);
}
