package com.alianzaf1.market.persistence.mapper;

import com.alianzaf1.market.domain.Purchase;
import com.alianzaf1.market.persistence.entity.Compra;
import com.alianzaf1.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @Mapping(source = "idCompra", target ="purchaseId"),
            @Mapping(source = "idCliente", target ="clientId"),
            @Mapping(source = "fecha", target ="date"),
            @Mapping(source = "medioPago", target ="paymentMethod"),
            @Mapping(source = "estado", target ="state"),
            @Mapping(source = "comentario", target ="comment"),
            @Mapping(source = "productoList", target ="itemList"),
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}
