package com.hibinheritance.model;

import jakarta.persistence.Embeddable;

@Embeddable

public class Address {
    private String streetaddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }
}
