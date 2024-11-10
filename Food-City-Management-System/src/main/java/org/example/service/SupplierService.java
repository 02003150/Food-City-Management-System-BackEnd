package org.example.service;

import org.example.dto.Supplier;
import org.example.entity.SupplierEntity;

import java.util.List;

public interface SupplierService {
    SupplierEntity addSupplier(Supplier supplier);
    void deleteSupplier(Integer suplierId);
    SupplierEntity updateSupplier(Supplier supplier);
    List<Supplier> getSupplier();
    List<Supplier> searchByCompany(String supplierCompany);
}
