/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8;

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
        Produkt[] tab = new Produkt[10];
        tab[0] = new ksiazka(30, "Hobbit", "Fantastyka");
        tab[1] = new Dzem(3,"Dzem truskawkowy", "Opis");
        tab[2] = new Dlugopis(1,"Dlugopis", "Czarny atrament");
        tab[3] = new Czekolada(3,"Milka", "Gorzka");
        tab[4] = new Polopiryna(10,"Polopiryna", "Lek przeciwbolowy");
        tab[5] = new ksiazka(40,"Wiedzmin", "Fantastyka");
        tab[6] = new ksiazka(50,"Thinking in Java ", "Edukacja");
        tab[7] = new Czekolada(4,"Milka", "Mleczna");
        tab[8] = new Dzem(5,"Dzem sliwkowy", "Opis");
        tab[9] = new Dlugopis(2,"Dlugopis", "Niebieski atrament");
        
        for(int i=0;i<10;i++){
            tab[i].zakup();
            tab[i].pokazDane();
        }
    }

}
