/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Pizza implements InterfacePizza{
    private String nazev;
    private double cena;
    private ArrayList<Surovina> suroviny;
    private int velikost;
    Scanner scan;
    @Override
    public String getNazev() {return this.nazev;}
    @Override
    public void setNazev(String nazev) {this.nazev = nazev;}
    @Override
    public void setCena(double cena) {this.cena = cena;}
    @Override
    public double getCena() {return this.cena;}
    @Override
    public void setSuroviny(ArrayList suroviny) {
        FileWork files = new FileWork();
        SeznamSurovin sez;
        
            sez = files.nactiSeznamSurovin();
        
        System.out.println("Zadej pocet surovin");
        int pocet = scan.nextInt();
        for (int i = 0; i < pocet; i++) {
            System.out.println("Zadej nazev suroviny");
            String nazev = scan.nextLine();
            
            
            
            
        }
        
        
        
        this.suroviny = suroviny;}
    @Override
    public ArrayList getSuroviny() {return this.suroviny;}
    @Override
    public int getVelikost() {return this.velikost;}
    @Override
    public void setVelikost(int velikost) {this.velikost = velikost;}

    public Pizza(String nazev, double cena, ArrayList suroviny, int velikost) {
        this.nazev = nazev;
        this.cena = cena;
        this.suroviny = suroviny;
        this.velikost = velikost;
    }

   
}
