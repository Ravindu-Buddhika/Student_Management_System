package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private String contactNumber;
    private String email;
    private LocalDate date;
    private String address;
}
