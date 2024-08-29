package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.persistence.entity.MKServicios.ServicioCaracteristica;
import com.alianzaf1.market.persistence.entity.MKServicios.ServicioCaracteristicaPK;
import com.alianzaf1.market.persistence.repository.ServicioCaracteristicaCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/featuresbyservices")
public class ServiceFeatureController {

    @Autowired
    private ServicioCaracteristicaCRUDRepository repository;

    @GetMapping
    public List<ServicioCaracteristica> getAll(){
        return (List<ServicioCaracteristica>) repository.findAll();
    }

}
