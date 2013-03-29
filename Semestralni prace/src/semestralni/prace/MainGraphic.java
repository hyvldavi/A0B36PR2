/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
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
    BorderLayout border;
    Container con;
    
    public MainGraphic(){
        con = getContentPane();       
        setBounds(0,0,1000,600);
        
        border = new BorderLayout();
        con.setLayout(border);
              
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        button = new JButton("Seznam surovin");
        con.setLayout(border);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
            
            
                    
                    JInternalFrame f = new JInternalFrame("Suroviny",false,true);                    
                    f.setVisible(true);
                    f.setClosable(true);
                    f.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
                    
                    con.add(f,BorderLayout.CENTER); 
                
            }
            
        });       
        con.add(button,BorderLayout.WEST);
        
    }
    
    
    
}
