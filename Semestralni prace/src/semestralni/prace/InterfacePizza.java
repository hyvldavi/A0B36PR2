/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public interface InterfacePizza {
    public double      upecPizzu(double vydelek);
    public String    getNazev();
    public void      setNazev(String nazev);
    public void      setCena(double cena);
    public double    getCena();
    public void      setSuroviny(int pocet,String nazev);
    public ArrayList getSuroviny();
    public int       getVelikost();
    public void      setVelikost(int velikost);
}
