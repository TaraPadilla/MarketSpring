package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.persistence.entity.MKServicios.Caracteristica;
import com.alianzaf1.market.persistence.repository.CaracteristicaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feature")
public class FeatureController {

    @Autowired
    private CaracteristicaCrudRepository repository;

    @GetMapping
    public List<Caracteristica> getAll(){
        return (List<Caracteristica>) repository.findAll();
    }
}
