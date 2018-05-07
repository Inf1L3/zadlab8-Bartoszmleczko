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
public abstract class FiguraGeometryczna {

    abstract float obliczPole();

    public FiguraGeometryczna() {
    }

    @Override
    public String toString() {
        return "FiguraGeometryczna{" + '}';
    }

}
