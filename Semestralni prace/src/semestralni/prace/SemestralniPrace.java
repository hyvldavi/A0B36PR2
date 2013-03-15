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
        AbstractSurovina s = new Surovina("T",1,1,2);
        s.setNazev("testo");
        System.out.println(s.getNazev());
        System.out.println(s.toString());
        
        
    }
}
