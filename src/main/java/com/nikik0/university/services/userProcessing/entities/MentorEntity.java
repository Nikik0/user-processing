package com.nikik0.university.services.userProcessing.entities;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("mentor")
@Data
public class MentorEntity extends UserEntity {
    private List<String> groupsAttached;
}
