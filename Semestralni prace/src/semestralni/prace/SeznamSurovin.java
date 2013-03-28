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
    
            public Source() throws FileNotFoundException, IOException, ClassNotFoundException{
                String help;
            FileWork files = new FileWork();
            SeznamSurovin s = files.nactiSeznamSurovin();
            Container con = getContentPane();
            BorderLayout border = new BorderLayout();
            con.setLayout(border);
            menu = new JMenuBar();
            men = new JMenu("Ahoj");
            item = new JMenuItem("Nazdar");
            label = new JLabel(help = s.vypis());
            setResizable(false);
            con.setBackground(Color.ORANGE);
            setBounds(200,200,400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
            con.add(menu,BorderLayout.NORTH);
            menu.add(men);
            men.add(item); 
            con.add(label,BorderLayout.CENTER);
            
        }
        }

public class SeznamSurovin extends List implements Serializable  {
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
    public String vypis() throws FileNotFoundException, IOException, ClassNotFoundException{
        String alpha;
         FileWork files = new FileWork();
         SeznamSurovin s1 = files.nactiSeznamSurovin();
         int a = s1.list.size();
         for (int i = 0; i < a; i++) {
             alpha = s1.s.getNazev();
            return alpha;
        }
        return null;
        
    }
    public void zobrazSeznam(SeznamSurovin s) throws FileNotFoundException, IOException, ClassNotFoundException{        
        Source okno = new Source();
        okno.setVisible(true);
        
        
        
    }
    public boolean najdiSurovinu(String nazev){
        boolean bool = true;
        return bool;
    }
    //vypisuje jenom nazev zatim
    
    
    
    
    public SeznamSurovin() {        
        list = new ArrayList<> ();
    }
    
}
