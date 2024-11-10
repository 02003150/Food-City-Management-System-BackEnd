package edu.icet.crm.controller;

import edu.icet.crm.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class productController {
    final
    @PostMapping
    public void addProduct(@RequestBody Product product){

    }
}
