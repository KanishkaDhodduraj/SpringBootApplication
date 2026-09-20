package com.spring.Application.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String marks;
    Boolean isSaved;
}