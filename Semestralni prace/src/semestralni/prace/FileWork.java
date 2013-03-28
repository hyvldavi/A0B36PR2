/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author David
 */
public class FileWork implements Serializable{
    private File soubor;
    private ObjectOutputStream zapis;
    private ObjectInputStream cteni;
    
    public void ulozSeznamSurovin(SeznamSurovin s) {
        File soubor = new File("Suroviny"); 
        if (!soubor.exists()) {
            try {soubor.createNewFile();} 
            catch (IOException ex) {System.out.println("Soubor nelze vytvorit!");}
}        
        try {zapis = new ObjectOutputStream(new FileOutputStream("Suroviny"));}
        catch (IOException ex) {System.out.println("Soubor neexistuje");}
        try {zapis.writeObject(s);}
        catch (IOException ex) {System.out.println("Chyba pri zapisu!");}
        try {zapis.close();} 
        catch (IOException ex) {System.out.println("Chyba pri uzavirani proudu zapisu!");}
    }
    public SeznamSurovin nactiSeznamSurovin(){
        SeznamSurovin help = null;
        try {cteni = new ObjectInputStream(new FileInputStream("Suroviny"));}
        catch (IOException ex) {System.out.println("Chyba pri nacitani souboru!");}
        try {help = (SeznamSurovin)cteni.readObject();}
        catch (IOException ex) {System.out.println("Chyba pri cteni souboru!");} 
        catch (ClassNotFoundException ex) {System.out.println("Chyba pri prekladu!");}
        try {cteni.close();}
        catch (IOException ex) {System.out.println("Chyba pri uzavirani cteciho proudu!");}
        return help;
    }

    public FileWork() {
    }
     
    
}
