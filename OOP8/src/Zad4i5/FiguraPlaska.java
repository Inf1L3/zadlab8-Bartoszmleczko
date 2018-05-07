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
public abstract class FiguraPlaska extends FiguraGeometryczna {

    @Override
    abstract float obliczPole();

    abstract float obliczObwod();

    @Override
    public String toString() {
        return "Obliczanie parametrów figury płaskiej";
    }

}
