/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.io.*;


/**
 *
 * @author David
 */
public class FileWork implements Serializable{
    private File soubor;
    private ObjectOutputStream zapis;
    private ObjectInputStream cteni;
    
    public void ulozSeznamSurovin(SeznamSurovin s) throws IOException{
        File soubor = new File("Suroviny"); 
        if (!soubor.exists()) {soubor.createNewFile();}        
        zapis = new ObjectOutputStream(new FileOutputStream("Suroviny"));        
        zapis.writeObject(s);
        zapis.close();
    }
    public SeznamSurovin nactiSeznamSurovin() throws FileNotFoundException, IOException, ClassNotFoundException{
        SeznamSurovin help;
        cteni = new ObjectInputStream(new FileInputStream("Suroviny"));
        help = (SeznamSurovin)cteni.readObject();
        return help;
    }

    public FileWork() {
    }
     
    
}
