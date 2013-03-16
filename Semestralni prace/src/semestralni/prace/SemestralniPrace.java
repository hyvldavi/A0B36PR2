/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

/**
 *
 * @author David
 */
public class SemestralniPrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Surovina s1 = new Surovina("a",1,2,3);       
         Surovina s2 = new Surovina("b",4,5,6);   
          Surovina s3 = new Surovina("c",7,8,9);   
          SeznamSurovin seznam = new SeznamSurovin();
          seznam.pridejSurovinu(s1);
          seznam.pridejSurovinu(s2);
          seznam.pridejSurovinu(s3);
         seznam.vypisSuroviny();
        
        
        
        
    }
}
