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

public class Customer {
    private Integer id;
    private String name;
    private String address;
    private LocalDate date;
    private String description;

}
