package com.company;

public abstract class Product {
    public double price;
    public String name;

    public double getPrice() {
        return price;
    }
}
class Product1 extends Product {
public Product1(String name,double price){
    this.name=name;
    this.price=price;
}

}

class Product2 extends Product{
    public Product2(String name,double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return this.price*0.2;
    }
}
