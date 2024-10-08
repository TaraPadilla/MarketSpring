package com.alianzaf1.market.web.controller;

import com.alianzaf1.market.domain.Product;
import com.alianzaf1.market.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    @Operation(summary = "Get all products",
            description     = "Traer todos los productos del market")
    @ApiResponse(responseCode = "200", description = "Productos OK")
    public ResponseEntity<List<Product>> getAll(){
       return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/test")
    public String test(){
        return "Hola mundo";
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get Product",
            description = "Search a product with an ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Product OK"),
            @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity <Product> getProduct(
            @Parameter(description="Id of the product",
            required = true,example = "1")
            @PathVariable("id") int productId){
        return productService.getProduct(productId)
                .map(product -> new ResponseEntity<>(product,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> getByCategoria(@PathVariable("id") int categoryId){
        List<Product> products = productService.getByCategoria(categoryId);

        if (!products.isEmpty()) {
            return new ResponseEntity<>(products,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int productId) {
        if (productService.delete(productId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}
