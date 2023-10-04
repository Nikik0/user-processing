package com.nikik0.university.services.userProcessing.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
public class UserEntity {
    private Long id;
    private String name;
    private String surname;
    private String additionalInfo;
    private int age;
    private UserRoles role;
}
