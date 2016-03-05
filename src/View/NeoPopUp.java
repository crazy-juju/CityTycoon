/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Town;
import citytycoon.MajRunnable;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author julien
 */
public class NeoPopUp extends JDialog implements ActionListener {
    private JPanel pano;
    private GridBagConstraints cont ;
    private JTextField town_name;
    private JButton validate ;
   

    public NeoPopUp(){
        

        validate= new JButton(" Valider ");
        validate.addActionListener(this);
        town_name=new JTextField(25);

        cont= new GridBagConstraints();
        cont.fill= GridBagConstraints.BOTH;
        pano = new JPanel();
        cont.gridx=0;
        pano.add(new JLabel(" Entrez le nom de votre village : "),cont);
        cont.gridx=1;
        cont.gridy=0;
        pano.add(town_name,cont);
        cont.gridx=1;
        pano.add(validate,cont);
        this.setContentPane(pano);
        this.pack();
        this.setTitle(" Nouvelle Partie ");
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(e.getSource()==validate){
            Town town= new Town() ;
            town.setName(town_name.getText());
            //System.out.println(town.getName());
            GameWindow gw = new GameWindow(town);
            Thread t1 = new Thread(new MajRunnable(gw));
            t1.start();
            this.dispose();
           
        }
    
    }
    
}
