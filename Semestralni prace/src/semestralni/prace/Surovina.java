/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.util.Objects;

/**
 *
 * @author David
 */
public class Surovina implements InterfaceSurovina {
      private String nazev ;
      private double spotreba ;
      private double mnozstvi ;
      private double cena     ;

    @Override
    public String toString() {
        return "Surovina{" + "nazev=" + this.nazev + ", spotreba=" + spotreba + ", mnozstvi=" + mnozstvi + ", cena=" + cena + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nazev);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.spotreba) ^ (Double.doubleToLongBits(this.spotreba) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.mnozstvi) ^ (Double.doubleToLongBits(this.mnozstvi) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.cena) ^ (Double.doubleToLongBits(this.cena) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Surovina other = (Surovina) obj;
        if (!Objects.equals(this.nazev, other.nazev)) {
            return false;
        }
        if (Double.doubleToLongBits(this.spotreba) != Double.doubleToLongBits(other.spotreba)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mnozstvi) != Double.doubleToLongBits(other.mnozstvi)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cena) != Double.doubleToLongBits(other.cena)) {
            return false;
        }
        return true;
    }
     
    
    public Surovina(String nazev,double spotreba,double mnozstvi,double cena) {
         this.nazev = nazev;
         this.spotreba = spotreba;
         this.mnozstvi = mnozstvi;
         this.cena = cena;
    }

    @Override
    public String getNazev() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNazev(String nazev) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getSpotreba() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSpotreba(double spotreba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getMnozstvi() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMnozstvi(double mnozstvi) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getCena() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCena(double cena) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
     
 
    
}
