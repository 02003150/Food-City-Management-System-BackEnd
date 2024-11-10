package org.example.controller;

import org.example.dto.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;
    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.OK)
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @GetMapping("/get-product")
    public List<Product> getProduct(){
        return service.getProduct();
    }
//    @GetMapping("/search-by-name/{productName}")
//    public List<Product> searchByProductName(@PathVariable String productName){
//        return service.searchProduct(productName);
//    }

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
