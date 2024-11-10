package org.example.service;

import org.example.dto.Product;
import org.example.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    ProductEntity addProduct(Product product);

    List<Product> getProduct();

    List<Product> searchProduct(Integer id);

    ProductEntity updateProduct(Product product);

    void deleteProduct(Integer productId);
}
