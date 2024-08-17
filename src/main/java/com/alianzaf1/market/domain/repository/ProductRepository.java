package com.alianzaf1.market.domain.repository;
import com.alianzaf1.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
   List<Product> getAll();
   List<Product> getByCategoria(int categoryId);
   List<Product> getScarseProducts(int quantity);
   Optional<Product> getProduct(int productId);
   Product save(Product product);
   void delete(int productId);
}
