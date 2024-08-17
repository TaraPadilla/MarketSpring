package com.alianzaf1.market.persistence;

import com.alianzaf1.market.domain.Purchase;
import com.alianzaf1.market.domain.repository.PurchaseRepository;
import com.alianzaf1.market.persistence.crud.CompraCrudRepository;
import com.alianzaf1.market.persistence.entity.Compra;
import com.alianzaf1.market.persistence.mapper.PurchaseMapper;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> getAll() {
        return purchaseMapper.toPurchases(compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> purchaseMapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = purchaseMapper.toCompra(purchase);
        compra.getProductoList().forEach(
                producto -> producto.setCompra(compra)
        );

        return purchaseMapper.toPurchase(compraCrudRepository.save(compra));
    }
}
