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
public class Walec extends FiguraPrzestrzenna{
    private float r;
    private float h;

    public Walec(float r, float h) {
        this.r = r;
        this.h = h;
    }
    
    @Override
    float obliczPole() {
        return (float) ((float)2*Math.PI*r*(r+h));
    }

    @Override
    float obliczObjetosc() {
        return (float)Math.PI*r*r*h;
    }
        @Override
    public String toString() {
        return super.toString() + "Pole : " + obliczPole() + "Objetosc: " + obliczObjetosc();
    }
}
