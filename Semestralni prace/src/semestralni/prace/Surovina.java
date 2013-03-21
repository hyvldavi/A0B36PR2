/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author David
 */
public class Surovina implements InterfaceSurovina,Serializable {
      private String nazev ;
      private double spotreba ;
      private double mnozstvi ;
      private double cena     ;

    @Override
    public String toString() {
        return "Surovina{" + "nazev=" + this.nazev + ", spotreba=" + spotreba + ", mnozstvi=" + mnozstvi + ", cena=" + cena + '}';
    }
    public String toStringSave(Surovina s){
        String a = null;
        a = this.nazev+"/"+this.cena+"/"+this.mnozstvi+"/"+this.spotreba+"*";
        return a;
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
    public String getNazev()                   {return this.nazev;}
    @Override
    public void   setNazev(String nazev)       {this.nazev = nazev;}
    @Override
    public double getSpotreba()                {return this.spotreba;}
    @Override
    public void   setSpotreba(double spotreba) {this.spotreba = spotreba;}
    @Override
    public double getMnozstvi()                {return this.mnozstvi;}
    @Override
    public void   setMnozstvi(double mnozstvi) {this.mnozstvi = mnozstvi;};
    @Override
    public double getCena()                    {return this.cena;}
    @Override
    public void   setCena(double cena)         {this.cena = cena;}    
}
