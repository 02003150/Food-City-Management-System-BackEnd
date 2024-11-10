package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer oderId;
    private LocalDate oderDate;
    private Double netTotal;
    private String description;
}
