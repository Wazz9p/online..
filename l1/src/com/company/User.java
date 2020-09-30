package com.company;

import Interface.IOutput;

public class User implements IOutput {

    public String name;
    public double balance;
    private String password;
    public User()
    {
        this.name="username";
        this.balance=0;
        this.password="1111";
    }
    public User(String name,String password)
    {
        this.name=name;
        this.balance=0;
        this.password=password;
    }
    public User(String name,double balance,String password)
    {
        this.name=name;
        this.balance=balance;
        this.password=password;
    }

    public void ReduceBalance(double price)
    {
        if(balance>=price)
        balance-=price;
    }

    public void printInformation()
    {
        System.out.printf("%s, %f \n", name,balance);
    }
}
