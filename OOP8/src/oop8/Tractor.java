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
public class Tractor extends Produkt {

    public Tractor(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void zakup() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }

    @Override
    public void pokazDane() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    
}
