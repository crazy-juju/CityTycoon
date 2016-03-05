/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AddController;
import Model.Town;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julien
 */
public class BuiltInternalWindow extends JInternalFrame implements ActionListener {
    GridBagConstraints cont= new GridBagConstraints();
    JPanel panel= new JPanel();
    String category;
    Town city;
    ArrayList<JButton> lvl_up;
    JButton add=new JButton();
    public BuiltInternalWindow(Town t ,String s){
        category=s;
        city=t;
        cont.fill=GridBagConstraints.BOTH;
        panel.setLayout(new GridBagLayout());
        lvl_up= new ArrayList<>();
        add.addActionListener(this);
        init();
    }
    
    public void init(){
        switch(category){
            case "home":
                initHome();
                break;
                    
        }
        
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }
    
    public void initHome(){
        cont.gridy=1;
        cont.gridx=1;
        add.setText(" Ajouter une Maison ");
        panel.add(add,cont);
        for(int i=0;i<city.getNb_home();i++){
            cont.gridx=0;
            cont.gridy+=1;
            cont.gridwidth=3;
            panel.add(new JLabel(" Numero : "+city.getHomes().get(i).getId()+" | Niveau : "+city.getHomes().get(i).getLevel()+" | Conso au niveau supérieur : "+city.getHomes().get(i).getEat_neededlvlup()+" | Habitants au niveau supérieur : "+city.getHomes().get(i).getNb_hablvlup()+" | Coût en bois pour niveau suivant  : "+city.getHomes().get(i).getWood_pricelvlup()+" | "),cont);
            cont.gridx=4;
            cont.gridwidth=1;
            int lp=city.getHomes().get(i).getLevel()+1;
            lvl_up.add(new JButton(" Passer la maison au niveau : "+lp+" "));
            lvl_up.get(i).addActionListener(this);
            panel.add(lvl_up.get(i),cont);
        }
        
        this.setTitle(" Maisons : ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e.getSource()==add){
            if(AddController.AddHome(city,city.getNb_wood(),city.getProd_food())==true){
               panel.removeAll();
               this.init();
           }
       }
    
    }
}
