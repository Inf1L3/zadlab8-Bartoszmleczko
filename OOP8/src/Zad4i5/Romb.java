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
public class Romb extends FiguraPlaska{

    private float a;
    private float h;

    public Romb(float a, float h) {
        this.a = a;
        this.h = h;
    }
    
    
    @Override
    float obliczPole() {
        return a*h;
    }

    @Override
    float obliczObwod() {
        return 4*a;
    }
        @Override
    public String toString(){
        return super.toString()+" Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
}
