package org.example;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("dafault name", 50000, "tobi@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this (name, creditLimit, "unknown@email");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this. name = name;
        this. creditLimit = creditLimit;
        this. emailAddress = emailAddress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
