package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.dat"))) {
            ArrayList<Product>listOfProduct=new ArrayList<Product>();
            listOfProduct.add(new Product1("product1",10));
            listOfProduct.add(new Product2("product2",100));
            oos.writeObject(listOfProduct);

        } catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        double overallBalance=0;
        ArrayList<User> users=new ArrayList<>();
        users.add(new User("Name1",12000,"1111"));
        users.add(new User("Name2",1200,"qwerty"));
        users.add(new User("Name3","123"));
        for (User user:users) {
            if(user.balance==0)
            {
                users.remove(user);
            }
            overallBalance+= user.balance;
        }
        ArrayList<Product> newList= new ArrayList<Product>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.dat")))
        {
            newList=((ArrayList<Product>)ois.readObject());
           User user=users.get(0);
            for (Product product:newList) {
                user.BuyProduct(product);
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
