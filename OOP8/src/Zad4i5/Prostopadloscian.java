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
public class Prostopadloscian extends FiguraPrzestrzenna {

    private float x;
    private float y;
    private float h;

    public Prostopadloscian(float x, float y, float h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    @Override
    float obliczPole() {
        return 2 * (x * y + y * h + h * x);
    }

    @Override
    float obliczObjetosc() {
        return x * y * h;
    }

    @Override
    public String toString() {
        return super.toString() + "Pole : " + obliczPole() + "Objetosc: " + obliczObjetosc();
    }

}
