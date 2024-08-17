package com.alianzaf1.market.domain.service;

import com.alianzaf1.market.domain.Purchase;
import com.alianzaf1.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    List<Purchase> getAll(){
      return purchaseRepository.getAll();
    }
    Optional<List<Purchase>> getByClient(String clientId){
      return purchaseRepository.getByClient(clientId);
    }
    Purchase save(Purchase purchase){
      return purchaseRepository.save(purchase);
    }

}
