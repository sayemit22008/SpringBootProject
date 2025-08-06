package com.studentgrading.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double classTest1;
    private double classTest2;
    private double classTest3;
    private double average;

    private String status;
    
    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClassTest1() {
        return classTest1;
    }

    public void setClassTest1(double classTest1) {
        this.classTest1 = classTest1;
    }

    public double getClassTest2() {
        return classTest2;
    }

    public void setClassTest2(double classTest2) {
        this.classTest2 = classTest2;
    }

    public double getClassTest3() {
        return classTest3;
    }

    public void setClassTest3(double classTest3) {
        this.classTest3 = classTest3;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

