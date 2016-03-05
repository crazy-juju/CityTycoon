/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Town;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author julien
 */
public class MyWindow extends JFrame implements ActionListener {
    private JPanel panel;
    private GridBagConstraints cont;
    private JMenuBar menubar;
    private JMenu menu;
    private JMenuItem neo,load;
    private Town town;
    
    
    
    
            
    private void init(){
        town= new Town();
        panel= new JPanel();
        cont = new GridBagConstraints();
        menubar=new JMenuBar();
        menu=new JMenu(" Partie ");
        neo=new JMenuItem(" Nouvelle ");
        load=new JMenuItem(" Charger ");
        cont.fill=GridBagConstraints.BOTH;
        
        this.setTitle("City Tycoon By  Crazy_Juju");
        neo.addActionListener(this);
    }
    public MyWindow(){
        
        
        init();
        this.setContentPane(panel);
        menu.add(neo);
        menu.add(load);
        menubar.add(menu);
        this.setJMenuBar(menubar);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void LoadGame(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource()==neo){
            
            NeoPopUp neop = new NeoPopUp();
        }
    
    
    }
    

    
}
