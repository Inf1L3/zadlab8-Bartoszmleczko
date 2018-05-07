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
public class Kolo extends FiguraPlaska {

    private float r;

    public Kolo(float r) {
        this.r = r;
    }

    @Override
    float obliczPole() {
        return (float) Math.PI * r * r;
    }

    @Override
    float obliczObwod() {
        return (float) Math.PI * 2 * r;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
}
