package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Product;
import org.example.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {

    final ProductService service;
    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.OK)
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @GetMapping("/get-product")
    public List<Product> getProduct(){
        return service.getProduct();
    }

    @GetMapping("/search-by-id/{id}")
    public List<Product> searchByProductId(@PathVariable Integer id){
        return service.searchProduct(id);
    }

    @PutMapping("/update-product")
    public void updateProduct(@RequestBody Product product){
         service.updateProduct(product);
    }
    @DeleteMapping("/delete-product/{productId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteProduct(@PathVariable Integer productId){
        service.deleteProduct(productId);
    }
}
