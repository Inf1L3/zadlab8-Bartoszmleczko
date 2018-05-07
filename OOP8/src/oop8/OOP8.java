/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8;

import Zad4i5.*;

/**
 *
 * @author student
 */
public class OOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Produkt[] tab = new Produkt[10];
        tab[0] = new ksiazka(30, "Hobbit", "Fantastyka");
        tab[1] = new Dzem(3, "Dzem truskawkowy", "Opis");
        tab[2] = new Dlugopis(1, "Dlugopis", "Czarny atrament");
        tab[3] = new Czekolada(3, "Milka", "Gorzka");
        tab[4] = new Polopiryna(10, "Polopiryna", "Lek przeciwbolowy");
        tab[5] = new ksiazka(40, "Wiedzmin", "Fantastyka");
        tab[6] = new ksiazka(50, "Thinking in Java ", "Edukacja");
        tab[7] = new Czekolada(4, "Milka", "Mleczna");
        tab[8] = new Dzem(5, "Dzem sliwkowy", "Opis");
        tab[9] = new Dlugopis(2, "Dlugopis", "Niebieski atrament");

        for (int i = 0; i < 10; i++) {
            tab[i].zakup();
            tab[i].pokazDane();
        }*/
       FiguraGeometryczna[] tab = new FiguraGeometryczna[15];
        tab[0] = new Kwadrat(3);
        tab[1] = new Prostokat(5, 2);
        tab[2] = new Trojkat(3, 4, 5);
        tab[3]= new Trapez(1, 2, 3, 4, 2);
        tab[4] = new Rownoleglobok(2, 4, 3);
        tab[5] = new Romb(5,4);
        tab[6] = new Kolo(3);
        tab[7] = new Szescian(4);
        tab[8] = new Prostopadloscian(2, 4, 5);
        tab[9] = new Kula(3);
        tab[10] = new Walec(3, 5);
        tab[11] = new Stozek(5, 5, 5);
        tab[12] = new Kwadrat(4);
        tab[13] = new Kolo(5);
        tab[14] = new Kula(6);
        
        for(int i=0;i<15;i++){
            System.out.println(tab[i].toString());
        }
    }

}
