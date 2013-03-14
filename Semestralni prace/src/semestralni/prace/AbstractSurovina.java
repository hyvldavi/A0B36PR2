/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

/**
 *
 * @author David
 */
public abstract class AbstractSurovina {
    String nazev;
    double spotreba;
    double mnozstvi;
    double cena;

    abstract String getNazev();
    abstract void setNazev(String nazev); 
    abstract double getSpotreba(); 
    abstract void setSpotreba(double spotreba); 
    abstract double getMnozstvi(); 
    abstract void setMnozstvi(double mnozstvi); 
    abstract double getCena(); 
    abstract void setCena(double cena); 
    
    
}
