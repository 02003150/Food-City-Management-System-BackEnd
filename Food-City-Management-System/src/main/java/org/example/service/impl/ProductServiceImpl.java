package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Product;
import org.example.entity.ProductEntity;
import org.example.repository.ProductRepository;
import org.example.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final ModelMapper mapper;
    final ProductRepository repository;

    @Override
    public ProductEntity addProduct(Product product) {
       return repository.save(mapper.map(product, ProductEntity.class));
    }

    @Override
    public List<Product> getProduct() {
        List<Product> products=new ArrayList<>();
        repository.findAll().forEach(productEntity -> products.add(mapper.map(productEntity, Product.class)));
        return products;
    }

    @Override
    public List<Product> searchProduct(Integer id) {
        List<Product> productEntities=new ArrayList<>();
        productEntities.add(mapper.map(repository.findById(id), Product.class));
       return productEntities;
    }
    @Override
    public ProductEntity updateProduct(Product product) {
        return repository.save(mapper.map(product, ProductEntity.class));
    }
    @Override
    public void deleteProduct(Integer productId) {
        repository.deleteById(productId);
    }
}
