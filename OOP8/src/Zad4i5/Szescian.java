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
public class Szescian extends FiguraPrzestrzenna {

    private float x;

    public Szescian(float x) {
        this.x = x;
    }

    @Override
    float obliczPole() {
        return 6 * x * x;
    }

    @Override
    float obliczObjetosc() {
        return x * x * x;
    }

    @Override
    public String toString() {
        return super.toString() + "Pole : " + obliczPole() + "Objetosc: " + obliczObjetosc();
    }
}
