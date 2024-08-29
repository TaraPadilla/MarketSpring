package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.persistence.entity.MKServicios.Servicio;
import com.alianzaf1.market.persistence.repository.ServicioCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServicioCRUDRepository repository;

    @GetMapping
    public List<Servicio> getAll(){
        return (List<Servicio>) repository.findAll();
    }

}
