package com.example.home.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class HomeEntity {
    @Id
    @Column
    Integer id;
    @Column
    String fatherName;
    @Column
    String motherName;
    @Column
    String childOne;
    @Column
    String childTwo;
    @Column
    Integer phoneNumber;
    public HomeEntity(){}
    public HomeEntity(Integer id, String fatherName, String motherName, String childOne, String childTwo, Integer phoneNumber) {
        this.id = id;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.childOne = childOne;
        this.childTwo = childTwo;
        this.phoneNumber = phoneNumber;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getChildTwo() {
        return childTwo;
    }

    public void setChildTwo(String childTwo) {
        this.childTwo = childTwo;
    }

    public String getChildOne() {
        return childOne;
    }

    public void setChildOne(String childOne) {
        this.childOne = childOne;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
