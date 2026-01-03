package com.simplydockercompose.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    private String id;
    private String name;
    private String email;
    private String stream;
}
