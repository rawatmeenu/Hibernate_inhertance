package com.hibinheritance.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
//one table in db for entire hierarchy

public abstract class Payment {
//bcz were not going to use this Paymnet class directly
    @Id
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
