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
    public String getNazev();
    public String setNazev();
    public double setCena();
    public double getCena();
    public ArrayList setSuroviny();
    public ArrayList getSuroviny();
    public int getVelikost();
    public int setVelikost();
}
