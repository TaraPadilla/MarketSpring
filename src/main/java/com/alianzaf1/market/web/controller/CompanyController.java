package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.persistence.entity.MKBases.Empresa;
import com.alianzaf1.market.persistence.repository.EmpresaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private EmpresaCrudRepository repository;

    @PostMapping
    public Empresa createCompany(@RequestBody Empresa empresa){
        return repository.save(empresa);
    }

    @GetMapping
    public List<Empresa> getAllCompanies(){
        return (List<Empresa>) repository.findAll();
    }

}
