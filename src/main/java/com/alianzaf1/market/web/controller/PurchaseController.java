package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.domain.Purchase;
import com.alianzaf1.market.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping("/all")
     public List<Purchase> getAll(){
        return purchaseService.getAll();
    }

    @GetMapping("/test")
    public String test(){
        return "Hola mundo";
    }

    @GetMapping("/cliente/{clientId}")
    public Optional<List<Purchase>> getByClient(@PathVariable String clientId){
        return purchaseService.getByClient(clientId);
    }

    @PostMapping("/save")
    public Purchase save(@RequestBody Purchase purchase){
        return purchaseService.save(purchase);
    }
}
