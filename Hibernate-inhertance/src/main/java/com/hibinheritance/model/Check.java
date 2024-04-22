package com.hibinheritance.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="bankcheck")
@PrimaryKeyJoinColumn(name="id")
public class Check extends Payment {

    private String checknumber;

    public String getCheckNo() {
        return checknumber;
    }

    public void setCheckNo(String checknumber) {
        this.checknumber = checknumber;
    }
}
