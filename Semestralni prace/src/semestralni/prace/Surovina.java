/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

/**
 *
 * @author David
 */
public class Surovina extends AbstractSurovina {
    
    @Override
    String getNazev() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    void setNazev(String nazev) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    double getSpotreba() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    void setSpotreba(double spotreba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    double getMnozstvi() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    void setMnozstvi(double mnozstvi) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    double getCena() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    void setCena(double cena) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Surovina(String nazev,double cena,double mnozstvi,double spotreba){
        nazev    = super.   nazev;
        cena     = super.    cena;
        mnozstvi = super.mnozstvi;
        spotreba = super.spotreba;
        
    }
}
