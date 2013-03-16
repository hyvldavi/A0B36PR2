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
        Surovina s = new Surovina("a",1,2,3);       
        System.out.println(s.toString());
        s.setNazev("B");
        String a = s.getNazev();
        System.out.println(a);
        System.out.println(s.toString());
        
        
    }
}
