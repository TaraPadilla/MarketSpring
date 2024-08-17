package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.domain.Purchase;
import com.alianzaf1.market.domain.service.PurchaseService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PurchaseController {
    private PurchaseService purchaseService;

     public List<Purchase> getAll(){
        return PurchaseController.getAll();
    }
    Optional<List<Purchase>> getByClient(String clientId){
        return PurchaseController.getByClient(clientId);
    }
    Purchase save(Purchase purchase){
        return PurchaseController.save(purchase);
    }
}
