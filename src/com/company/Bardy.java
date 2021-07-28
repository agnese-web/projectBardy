package com.company;

public class Bardy extends Car {

    private String brand = "Bardy";
    public Bardy(int noOfTires, String color, String brand) {
        super(noOfTires, color);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
