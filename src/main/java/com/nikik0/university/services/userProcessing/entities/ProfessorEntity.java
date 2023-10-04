package com.nikik0.university.services.userProcessing.entities;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Data
@Table("professor")
public class ProfessorEntity extends UserEntity{
    private List<String> subjectList;
}
