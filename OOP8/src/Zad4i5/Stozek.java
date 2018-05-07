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
public class Stozek extends FiguraPrzestrzenna{

    private float r;
    private float h;
    private float k;

    public Stozek(float r, float h, float k) {
        this.r = r;
        this.h = h;
        this.k = k;
    }
    
    @Override
    float obliczPole() {
        return (float)Math.PI*r*(r+k);
    }

    @Override
    float obliczObjetosc() {
        return (float)(Math.PI*r*r*h)/3;
    }
        @Override
    public String toString() {
        return super.toString() + "Pole : " + obliczPole() + "Objetosc: " + obliczObjetosc();
    }
}
