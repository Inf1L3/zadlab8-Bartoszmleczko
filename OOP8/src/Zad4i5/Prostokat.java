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
public class Prostokat extends FiguraPlaska{
    
    private float x;
    private float y;

    public Prostokat(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    @Override
    float obliczPole() {
        return x*y;
    }

    @Override
    float obliczObwod() {
        return 2*x+2*y;
    }
    @Override
    public String toString(){
        return super.toString()+" Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
}
