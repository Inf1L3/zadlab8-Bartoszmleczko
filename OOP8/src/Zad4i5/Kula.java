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
public class Kula extends FiguraPrzestrzenna{

    private float r;

    public Kula(float r) {
        this.r = r;
    }
    
    
    @Override
    float obliczPole() {
        return (float)Math.PI*r*r*4;
    }

    @Override
    float obliczObjetosc() {
        return (float)((Math.PI*r*r*r*4)/3);
    }
        @Override
    public String toString() {
        return super.toString() + "Pole : " + obliczPole() + "Objetosc: " + obliczObjetosc();
    }
}
