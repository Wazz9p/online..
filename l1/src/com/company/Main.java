package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        Product1 product1 =new Product1("product1",120);
        Product2 product2 = new Product2("product2",11);
        Product[]products=new Product[]{product1,product2};
        user.ReduceBalance(products[1].price);
    }
}
