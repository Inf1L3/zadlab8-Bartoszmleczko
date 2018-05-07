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
public class Trapez extends FiguraPlaska{
    private float x;
    private float y;
    private float z;
    private float a;
    private float h;
    public Trapez(float x, float y, float z, float a, float h) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    
    @Override
    float obliczPole() {
        return ((x+y)*h)/2;
    }

    @Override
    float obliczObwod() {
        return x+y+z+a;
    }
    @Override
    public String toString() {
        return super.toString() + " Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
    
}