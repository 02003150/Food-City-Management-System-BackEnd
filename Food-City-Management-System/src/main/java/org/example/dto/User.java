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
public class User {
    private Integer userId;
    private String name;
    private String address;
    private LocalDate dob;
    private Double salary;
    private String position;
    private String description;
}
