package org.example.repository;

import org.example.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<SupplierEntity,Integer> {
    List<SupplierEntity> findBysupplierCompany(String supplierCompany);
}
