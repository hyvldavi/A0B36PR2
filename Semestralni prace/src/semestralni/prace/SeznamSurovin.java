/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralni.prace;




import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;



/**
 *
 * @author David
 */
class Source extends JFrame{
    JButton button;
    JLabel label;
    JMenuBar menu;
    JMenu men;
    JMenuItem item;
    
    
    
            public Source(){
            Container con = getContentPane();
            BorderLayout border = new BorderLayout();
            con.setLayout(border);
            menu = new JMenuBar();
            men = new JMenu("Ahoj");
            item = new JMenuItem("Nazdar");
            
            setResizable(false);
            con.setBackground(Color.ORANGE);
            setBounds(200,200,400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
            con.add(menu,border.NORTH);
            menu.add(men);
            men.add(item);
            
            
            
        }
        }

public class SeznamSurovin implements Serializable  {
private Surovina s;
private ArrayList<Surovina> list;


    public Surovina getS() {return s;}
    public void setS(Surovina s) {this.s = s;}    
    public void pridejSurovinu(Surovina s) {      
        list.add(s);        
    }
    public void odeberSurovinu(Surovina s){
        list.remove(s);
    }
    public void vypisSuroviny(){
        int pocet = list.size();
        Surovina a;
        for (int i = 0; i < pocet; i++) {
           a = list.get(i);
            System.out.print(a.getNazev());
            System.out.println("");
        }
        
    }
    public void zobrazSeznam(SeznamSurovin s){
        Source okno = new Source();
        okno.setVisible(true);
        
        
        
    }
    public boolean najdiSurovinu(String nazev){
        boolean bool = true;
        return bool;
    }
    //vypisuje jenom nazev zatim
    
    
    
    
    public SeznamSurovin() {        
        list = new ArrayList<Surovina> ();
    }
    
}
