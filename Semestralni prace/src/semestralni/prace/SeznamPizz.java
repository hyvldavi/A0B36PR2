/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class SeznamPizz extends List {
    private Pizza p;
    private ArrayList<Pizza> list;
    
    public void pridejPizzu(Pizza p){list.add(p);}
    public void odeberPizzu(Pizza p){list.remove(p);}    
    public int getsSize(){
       int a;
       a = list.size();
       return a;      
    }    
    
    
    
    
    public SeznamPizz(){
        list = new ArrayList();
    }
   
    
}
