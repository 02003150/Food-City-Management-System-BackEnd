package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.dto.Supplier;
import org.example.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class SupplierController {

    final SupplierService service;

    @PostMapping("/add-supplier")
    @ResponseStatus(HttpStatus.OK)
    public void addSupplier(@RequestBody Supplier supplier){
        service.addSupplier(supplier);
    }

    @DeleteMapping("/delete-supplier/{suplierId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteSupplier(@PathVariable Integer suplierId){
        service.deleteSupplier(suplierId);
    }

    @PutMapping("/update-supplier")
    @ResponseStatus(HttpStatus.OK)
    public void updateSupplier(@RequestBody Supplier supplier){
        service.updateSupplier(supplier);
    }

    @GetMapping("/get-supplier")
    public List<Supplier> getSuppier(){
       return service.getSupplier();
    }
    @GetMapping("/search-by-companay/{supplierCompany}")
    public List<Supplier> searchByCompany(@PathVariable String supplierCompany){
        return service.searchByCompany(supplierCompany);
    }

}
