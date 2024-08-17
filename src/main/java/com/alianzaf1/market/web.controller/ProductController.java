package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.domain.Product;
import com.alianzaf1.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    public List<Product> getAll(){
       return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId){
        return productService.getProduct(productId);
    }
    @GetMapping("/category/{id}")
    public List<Product> getByCategoria(@PathVariable("id") int categoryId){
        return productService.getByCategoria(categoryId);
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productService.delete(productId);
    }
}
