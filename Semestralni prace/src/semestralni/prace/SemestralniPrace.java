/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;


/**
 *
 * @author David
 */
public class SemestralniPrace implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
       MainGraphic start = new MainGraphic();
      start.setVisible(true);
        FileWork saving = new FileWork();
        Surovina s1 = new Surovina("a",1,2,3);       
         Surovina s2 = new Surovina("b",4,5,6);   
          Surovina s3 = new Surovina("c",7,8,9);   
          SeznamSurovin seznam = new SeznamSurovin();
          seznam.pridejSurovinu(s1);
          seznam.pridejSurovinu(s2);
          seznam.pridejSurovinu(s3);
          saving.ulozSeznamSurovin(seznam);
          boolean bool = seznam.najdiSurovinu("k");
          System.out.println(bool);
         saving.ulozSeznamSurovin(seznam);
         seznam.vypisSuroviny();
        SeznamSurovin novy = saving.nactiSeznamSurovin();
        novy.vypisSuroviny();
        
        
         
    }
}
