package org.GenerationItaly.shopProject.model;

public abstract class Products{
    protected double weight;
    protected double price;

    public Products(){}

    public Products(double wight, double price){
        this.weight=wight;
        this.price=price;
    }

    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
}
