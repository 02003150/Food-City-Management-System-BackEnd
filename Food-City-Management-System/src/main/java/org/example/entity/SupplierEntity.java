package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer supplierId;
    private String supplierName;
    private String supplierCompany;
    private String supplierContactNumber;
}
