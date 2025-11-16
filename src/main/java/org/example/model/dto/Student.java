package org.example.model.dto;

import lombok.*;

import java.security.PrivateKey;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String id;
    private String name;
    private String contactNumber;
    private String email;
    private LocalDate date;
    private String address;
}
