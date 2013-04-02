/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author David
 */


public class SeznamSurovin extends List implements Serializable  {
    
private Surovina s; // privatni surovina jako prvek Arraylistu
private ArrayList<Surovina> list; // privatni Arraylist pro ukladani surovin


    public Surovina getS(int i) {
       s = list.get(i);
        return s;}
    //vraci surovinu na pozici i v poli
    public void setS(Surovina s) {this.s = s;}    
    //?zatim nepouzito
    public void pridejSurovinu(Surovina s) {list.add(s);}
    //?prida surovinu
    public void odeberSurovinu(Surovina s){list.remove(s);}
    //?odebere surovinu - predelat na nazev mozna...
    public void vypisSuroviny(){
        int pocet = list.size();
        Surovina a;
        for (int i = 0; i < pocet; i++) {
           a = list.get(i);
            System.out.print(a.getNazev());
            System.out.println("");
        }        
    }   
    //vypisuje nazvy surovin pod sebe    
    public boolean najdiSurovinu(String nazev){
        boolean bool = false;
        SeznamSurovin s;
        FileWork files = new FileWork();
        s = files.nactiSeznamSurovin();
        for (int i = 0; i < s.list.size(); i++) {
            Surovina source = s.getS(i);//cislo - index 
            if (nazev.toLowerCase().equals(source.getNazev().toLowerCase())) {
                bool = true;
            }            
        }
        return bool;
    }
    //vraci boolean pokud existuje surovina podle nazvu  
    public Surovina getsSurovinu(String nazev){
        Surovina sur = null;
        SeznamSurovin s;
        FileWork files = new FileWork();
        
        s = files.nactiSeznamSurovin();
        for (int i = 0; i < s.list.size(); i++) {
            Surovina source = s.getS(i);//cislo - index 
            if (nazev.toLowerCase().equals(source.getNazev().toLowerCase())) {
                sur = source;
            }            
        }       
        return sur;
    }
    // vraci surovinu pokud existuje nebo null pokud neexitsuje v seznamu
    public int getsSize(){
       int a;
       a = list.size();
       return a;      
    }
    //vraci delku seznamu
    
    public SeznamSurovin() {        
        list = new ArrayList<> ();
    }
   //konstruktor, vytvari arraylist
    
}
