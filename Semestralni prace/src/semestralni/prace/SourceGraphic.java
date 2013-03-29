/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;


import java.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;


/**
 *
 * @author David
 */
public class SourceGraphic extends JInternalFrame{
   JTable table;
   JButton button;
   FileWork files;
   SeznamSurovin sources;
   int width;
   BorderLayout layout;
   
    public SourceGraphic(){
        super();
        layout = new BorderLayout();
        files = new FileWork();
        sources = files.nactiSeznamSurovin();
        width = sources.getsSize();
        button = new JButton("Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        this.setBounds(100, 300, 500, 500);
        this.setTitle("Seznam surovin");
        this.setLayout(layout);
        Container con = getContentPane();
        String[] columnNames = {"Nazev","Spotreba","Mnozstvi","Cena"};
        Object[][] data = new Object[width][4];        
        table = new JTable(data, columnNames);
        con.add(table.getTableHeader(), BorderLayout.CENTER);
        con.add(table,BorderLayout.CENTER);
        con.add(button,BorderLayout.WEST);
        
        
        
        
        
        
        
        
    }
    
}
