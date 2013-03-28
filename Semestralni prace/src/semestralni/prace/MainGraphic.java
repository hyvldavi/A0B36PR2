/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author David
 */
public class MainGraphic extends JFrame{
    JButton button;
    JLabel label;
    
    public MainGraphic(){
        Container con = getContentPane();
        Container con2;
      setBounds(200,200,400,400);
        
        BorderLayout border = new BorderLayout();
        con.setLayout(border);
               
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        button = new JButton("Seznam surovin");
        con.setLayout(border);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                FileWork files = new FileWork();
                SeznamSurovin sez = new SeznamSurovin();
                
            }
            
        });       
        con.add(button,BorderLayout.WEST);
        
    }
    
    
    
}
