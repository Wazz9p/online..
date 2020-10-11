package com.company;

import Interface.IOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class User implements IOutput {
    public String name;
    public double balance;
    public ArrayList<Product> listOfProducts=new ArrayList<Product>();
    private HashMap<String,String> Info = new HashMap<String,String>();
    public User()
    {
        this.name="username";
        this.balance=0;
        Info.put(name,"1111");
    }
    public User(String name,String password)
    {
        this.name=name;
        this.balance=0;
        Info.put(name,password);
    }
    public User(String name,double balance,String password)
    {
        this.name=name;
        this.balance=balance;
        Info.put(name,password);
    }

    public void BuyProduct(Product product)
    {
        if(ReduceBalance(product.price))
        {
            listOfProducts.add(product);
        }
    }

    public boolean ReduceBalance(double price)
    {
        if(balance>=price) {
            balance -= price;
            return true;
        }
        return false;
    }

    public void printInformation()
    {
        System.out.printf("%s, %f \n", name,balance);
    }

}
