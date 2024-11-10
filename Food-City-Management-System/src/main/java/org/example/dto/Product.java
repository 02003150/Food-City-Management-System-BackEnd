package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Integer productId;
    private String productName;
    private Double price;
    private Integer qty;
    private LocalDate productAdddate;
    private String description;
}
