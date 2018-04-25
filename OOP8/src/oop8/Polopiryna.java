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
public class Polopiryna  extends Produkt{

    public Polopiryna(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void zakup() {
            System.out.println("Polopiryna kosztuje:  " + getPrice() + "zlotych");
    }

    @Override
    public void pokazDane() {
        System.out.println("Nazwa: " + getName());
        System.out.println("Cena: " + getPrice());
        System.out.println("Opis: " + getDescribe());
    }
    
}
