/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.awt.List;
import java.util.ArrayList;



/**
 *
 * @author David
 */
public class SeznamSurovin {
private Surovina s;
private ArrayList<Surovina> list;

    public Surovina getS() {return s;}
    public void setS(Surovina s) {this.s = s;}
    
    public void pridejSurovinu(Surovina s){
        list.add(s);
    }
    public void odeberSurovinu(Surovina s){
        list.remove(s);
    }
    public void vypisSuroviny(){
        int pocet = list.size();
        Surovina a;
        for (int i = 0; i < pocet; i++) {
           a = list.get(i);
            System.out.print(a.getNazev());
        }
        
    }

    public SeznamSurovin() {
        list = new ArrayList<Surovina> ();
    }
    
}
