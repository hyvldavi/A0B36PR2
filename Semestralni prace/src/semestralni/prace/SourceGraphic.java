/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;


import java.*;
import java.awt.Container;
import javax.swing.*;


/**
 *
 * @author David
 */
public class SourceGraphic extends JInternalFrame{
   JTable table;
   FileWork files;
   SeznamSurovin sources;
   int width;
   
    public SourceGraphic(){
        super();
        files = new FileWork();
        sources = files.nactiSeznamSurovin();
        width = sources.getsSize();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setBounds(100, 300, 500, 500);
        this.setTitle("Seznam surovin");
        Container con = getContentPane();
        String[] columnNames = {"Nazev","Spotreba","Mnozstvi","Cena"};
        Object[][] data = new Object[width][4];        
        table = new JTable(data, columnNames);
        con.add(table);
        
        
        
        
        
        
        
        
    }
    
}
