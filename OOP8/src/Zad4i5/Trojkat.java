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
public class Trojkat extends FiguraPlaska{
        private float x;
    private float y;
    private float z;

    
    public Trojkat(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    @Override
    float obliczPole() {
        return (x*y)/2;
    }

    @Override
    float obliczObwod() {
        return x+y+z;
    }
        @Override
    public String toString(){
        return super.toString()+" Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
}
