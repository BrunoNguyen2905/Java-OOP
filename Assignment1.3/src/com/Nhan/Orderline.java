package com.Nhan;

public class Orderline {
    private String name;
    private double price;
    private double quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double priceOfOrder() {
        return (price * quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getQuantity() {
        return quantity;
    }


    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


}
