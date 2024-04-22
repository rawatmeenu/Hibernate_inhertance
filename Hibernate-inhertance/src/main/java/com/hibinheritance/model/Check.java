package com.hibinheritance.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
// cc & ch are the values going to use in pmode column of payment db. for check & creditcard
public class Check extends Payment {

    private String checknumber;

    public String getCheckNo() {
        return checknumber;
    }

    public void setCheckNo(String checknumber) {
        this.checknumber = checknumber;
    }
}
