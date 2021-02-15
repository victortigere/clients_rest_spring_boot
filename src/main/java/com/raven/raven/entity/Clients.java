package com.raven.raven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Clients_TBL")
public class Clients {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surname;
    private String email;
    private String mobileNumber;

    public Clients() {
    }

    public Clients(int id, String name, String surname, String email, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
