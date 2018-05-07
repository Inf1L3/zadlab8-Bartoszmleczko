/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad4i5;

/**
 *
 * @author Bartosz
 */
public class Rownoleglobok extends FiguraPlaska{

    private float a;
    private float b;
    private float h;

    public Rownoleglobok(float a, float b, float h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    
    @Override
    float obliczPole() {
       return a*h;
    }

    @Override
    float obliczObwod() {
        return (a+b)*2;
    }
    
        @Override
    public String toString(){
        return super.toString()+" Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }

}
