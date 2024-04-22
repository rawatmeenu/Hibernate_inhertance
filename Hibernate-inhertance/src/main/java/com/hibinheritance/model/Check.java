package com.hibinheritance.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="bankcheck")
public class Check extends Payment {

    private String checknumber;

    public String getCheckNo() {
        return checknumber;
    }

    public void setCheckNo(String checknumber) {
        this.checknumber = checknumber;
    }
}
