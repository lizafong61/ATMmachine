package com.example.java;

public class Clients {
    private int id;
    private int pwd;
    private double balance;

    public Clients(int id, int pwd, double balance){
        this.id=id;
        this.pwd=pwd;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public int getPwd() {
        return pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
