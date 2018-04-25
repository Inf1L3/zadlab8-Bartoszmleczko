/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8;

/**
 *
 * @author student
 */
public abstract class Produkt {

    private double price;
    private String name;
    private String describe;
    
    public Produkt(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public abstract void zakup();

    public abstract void pokazDane();
    
}

