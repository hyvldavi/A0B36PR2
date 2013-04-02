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
    public void setSuroviny(int pocet,String nazev) {
        
        FileWork files = new FileWork();
        SeznamSurovin sez = files.nactiSeznamSurovin();
        boolean bool;
        for (int i = 0; i < pocet; i++) {
            bool = sez.najdiSurovinu(nazev);
            if (bool == true) {
                this.suroviny.add(sez.getsSurovinu(nazev));                 
            }
        }       
        }
    //nastavuje seznam surovin potrebny pro vytvoreni pizzy
    
    @Override
    public ArrayList getSuroviny() {return this.suroviny;}
    @Override
    public int getVelikost() {return this.velikost;}
    @Override
    public void setVelikost(int velikost) {this.velikost = velikost;}

    public Pizza(String nazev, double cena, int velikost) {
        this.nazev = nazev;
        this.cena = cena;
        this.suroviny = new ArrayList();
        this.velikost = velikost;
    }

    @Override
    public double upecPizzu(double vydelek) {
        vydelek += this.cena;
        for (int i = 0; i < this.suroviny.size(); i++) {
            Surovina s = this.suroviny.get(i);
            double mnozstvi = s.getMnozstvi();
            double spotreba = s.getSpotreba();
            double spotrebovano = mnozstvi - spotreba;
            s.setMnozstvi(spotrebovano);           
        } 
        return vydelek;
    }
    // odebira suroviny , chybi osetreni, zaporne suroviny, varovani nizkych surovin

   
}
