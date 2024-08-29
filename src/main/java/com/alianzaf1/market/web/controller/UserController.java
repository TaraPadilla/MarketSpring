package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.persistence.entity.MKBases.Usuario;
import com.alianzaf1.market.persistence.repository.UsuarioCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @PostMapping
    public Usuario createUser(@RequestBody Usuario user){
        return usuarioCrudRepository.save(user);
    }

    @GetMapping
    public List<Usuario> getAllUsers(){
        return (List<Usuario>) usuarioCrudRepository.findAll();
    }
}
