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
public class Kwadrat extends FiguraPlaska{
    
    private float x;

    public Kwadrat(float x) {
        this.x = x;
    }

    
    
    @Override
    float obliczPole() {
       return x*x;
    }

    @Override
    float obliczObwod() {
        return 4*x;
    }
    @Override
    public String toString(){
        return super.toString() + "Pole : " + obliczPole() + "Obwod: " + obliczObwod();
    }
}
