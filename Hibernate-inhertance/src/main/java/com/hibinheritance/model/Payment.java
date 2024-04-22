package com.hibinheritance.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//one table in db for entire hierarchy
@DiscriminatorColumn(name="pmode", discriminatorType = DiscriminatorType.STRING)
//which column should be used as discriminator column like in db we are using pmode which contains either check or creditcard.
//discriminatirtype is of String bcz pmode is of varchar:string type
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
