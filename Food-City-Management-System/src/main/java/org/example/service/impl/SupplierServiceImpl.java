package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Supplier;
import org.example.entity.SupplierEntity;
import org.example.repository.SupplierRepository;
import org.example.service.SupplierService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SupplierServiceImpl implements SupplierService {
    final ModelMapper mapper;
    @Autowired
    SupplierRepository repository;

    @Override
    public SupplierEntity addSupplier(Supplier supplier) {
        return repository.save(mapper.map(supplier, SupplierEntity.class));
    }

    @Override
    public void deleteSupplier(Integer suplierId) {
            repository.deleteById(suplierId);
    }

    @Override
    public SupplierEntity updateSupplier(Supplier supplier) {
        return repository.save(mapper.map(supplier,SupplierEntity.class));

    }

    @Override
    public List<Supplier> getSupplier() {
        List<Supplier> supplierList=new ArrayList<>();
        List<SupplierEntity> entities = repository.findAll();
        entities.forEach(supplierEntity -> {supplierList.add(mapper.map(supplierEntity, Supplier.class));
        });

        return supplierList;
    }

    @Override
    public List<Supplier> searchByCompany(String supplierCompany) {
        List<Supplier> entities=new ArrayList<>();
        List<SupplierEntity> byCompany = repository.findBysupplierCompany(supplierCompany);
        byCompany.forEach(suplierEntities->{
            entities.add(mapper.map(suplierEntities, Supplier.class));
        });
        return entities;
    }


}
