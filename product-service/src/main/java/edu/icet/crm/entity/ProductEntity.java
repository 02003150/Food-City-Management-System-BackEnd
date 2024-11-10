package edu.icet.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProductEntity {
    private Integer id;
    private String name;
    private Double price;
    private String description;
}