/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AddController;
import Model.Town;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

/**
 *
 * @author julien
 */
public class GameWindow extends JFrame implements ActionListener {
    private Town town;
    private JPanel panos;
    private GridBagConstraints cont ;
    private JMenuBar menubar;
    private JMenu save;
    private JButton add_home,add_mine,add_sawmill,add_carry,add_farm;
    private ArrayList<JButton> lvlup_homes,lvlup_mines,lvlup_farms,lvlup_carrys,lvlup_sawmills;
    private JLabel nb_habfree,nb_hab,prod_eat,prod_gold,prod_wood,prod_stone,stock_eat,stock_wood,stock_stone,stock_gold;
    private JScrollPane bar;
    
    
    private void init(){
        JPanel pano= new JPanel(new GridBagLayout());
        pano.setSize(new Dimension(600,400));
        
        //Nom de la ville en haut de la fenetre
        
        cont.gridx=2;
        cont.gridy=0;
        pano.add(new JLabel(town.getName()),cont);
        nb_habfree.setText(" Habitants : "+town.getNb_hab_free()+" Disponibles / ");
        
        //Partie ressource
        
        cont.gridy=1;
        cont.gridx=0;
        pano.add(nb_habfree,cont);
        nb_hab.setText(town.getNb_hab()+" ");
        cont.gridx=1;
        pano.add(nb_hab,cont);
        cont.gridx=0;
        cont.gridy=2;
        stock_eat.setText(" Stock de nourriture : "+town.getNb_food()+" ");
        pano.add(stock_eat,cont);
        cont.gridy=3;
        stock_gold.setText(" Stock d'or : "+town.getNb_gold()+" ");
        pano.add(stock_gold,cont);
        cont.gridy=4;
        stock_wood.setText(" Stock de bois : "+town.getNb_wood()+" ");
        pano.add(stock_wood,cont);
        cont.gridy=5;
        stock_stone.setText(" Stock de pierre : "+town.getNb_stone()+" ");
        pano.add(stock_stone,cont);
        cont.gridx=3;
        cont.gridy=2;
        prod_eat.setText(" Production de nourriture : "+town.getProd_food());
        pano.add(prod_eat,cont);
        cont.gridy=3;
        prod_gold.setText(" Production d' or : "+town.getProd_gold());
        pano.add(prod_gold,cont);
        cont.gridy=4;
        prod_wood.setText(" Prodution de bois : "+town.getProd_wood());
        pano.add(prod_wood,cont);
        cont.gridy=5;
        prod_stone.setText(" Production de pierre : "+ town.getProd_stone());
        pano.add(prod_stone,cont);
        
        
        cont.gridx=2;
        cont.gridy=6;
        pano.add(new JLabel(" BATIMENTS : "),cont);
        
        //Partie Batiments
        
        
        //Partie Maison 
        cont.gridx=0;
        cont.gridy=7;
        cont.gridwidth=5;
        BuiltInternalWindow internal_home= new BuiltInternalWindow(town,"home");
        pano.add(internal_home,cont);
        cont.gridwidth=1;
        
       
       
        
        
        //Partie Ferme
       
        cont.gridx=0;
        cont.gridy+=1;
        pano.add(new JLabel(" Fermes : "),cont);
        cont.gridx=1;
        pano.add(add_farm,cont);
        //this.town.getFarms().add(new Farm(1,10,12,15,17,25));this.town.setNb_farm(1);
        for(int i=0;i<town.getNb_farm();i++){
            cont.gridx=0;
            cont.gridy+=1;
            cont.gridwidth=3;
            pano.add(new JLabel(" Numero : "+town.getFarms().get(i).getId()+" | Niveau : "+town.getFarms().get(i).getLvl()+" | Production au niveau supérieur : "+town.getFarms().get(i).getProd_utlvlup()+" | Habitants requis au niveau supérieur : "+town.getFarms().get(i).getHab_needed()+" | Coût en bois pour niveau suivant  : "+town.getFarms().get(i).getWood_pricelvlup()+" | "),cont);
            cont.gridx=4;
            cont.gridwidth=1;
            int lp=town.getFarms().get(i).getLvl()+1;
            lvlup_farms.add(new JButton(" Passer la ferme au niveau : "+lp+" "));
            lvlup_farms.get(i).addActionListener(this);
            pano.add(lvlup_farms.get(i),cont);
        }
        
        //Partie Mine
       
        cont.gridx=0;
        cont.gridy+=1;
        pano.add(new JLabel(" Mines : "),cont);
        cont.gridx=1;
        pano.add(add_mine,cont);
        
        for(int i=0;i<town.getNb_mine();i++){
            cont.gridx=0;
            cont.gridy+=1;
            cont.gridwidth=3;
            pano.add(new JLabel(" Numero : "+town.getMines().get(i).getId()+" | Niveau : "+town.getMines().get(i).getLvl()+" | Production au niveau supérieur : "+town.getMines().get(i).getProd_utlvlup()+" | Habitants requis au niveau supérieur : "+town.getMines().get(i).getHab_needed()+" | Coût en bois pour niveau suivant  : "+town.getMines().get(i).getWood_pricelvlup()+" | Coût en Pierre pour niveau suivant : "+town.getMines().get(i).getStone_pricelvlup()+" | "),cont);
            cont.gridx=4;
            cont.gridwidth=1;
            int lp=town.getMines().get(i).getLvl()+1;
            lvlup_mines.add(new JButton(" Passer la mine au niveau : "+lp+" "));
            lvlup_mines.get(i).addActionListener(this);
            pano.add(lvlup_mines.get(i),cont);
        }
        
        //Partie Scierie
       
        cont.gridx=0;
        cont.gridy+=1;
        pano.add(new JLabel(" Scieries : "),cont);
        cont.gridx=1;
        pano.add(add_sawmill,cont);
        
        for(int i=0;i<town.getNb_sawmill();i++){
            cont.gridx=0;
            cont.gridy+=1;
            cont.gridwidth=3;
            pano.add( new JLabel(" Numero : "+town.getSawmills().get(i).getId()+" | Niveau : "+town.getSawmills().get(i).getLvl()+" | Production au niveau supérieur : "+town.getSawmills().get(i).getProd_utlvlup()+" | Habitants requis au niveau supérieur : "+town.getSawmills().get(i).getHab_needed()+" | " ),cont);
            cont.gridx=4;
            cont.gridwidth=1;
            int lp=town.getSawmills().get(i).getLvl()+1;
            lvlup_sawmills.add(new JButton(" Passer la scierie au niveau : "+lp+" "));
            lvlup_sawmills.get(i).addActionListener(this);
            pano.add(lvlup_sawmills.get(i),cont);
        }
        
        //Partie Carriere
       
        cont.gridx=0;
        cont.gridy+=1;
        pano.add(new JLabel(" Carriéres : "),cont);
        cont.gridx=1;
        pano.add(add_carry,cont);
        
        for(int i=0;i<town.getNb_carry();i++){
            cont.gridx=0;
            cont.gridy+=1;
            cont.gridwidth=3;
            pano.add(new JLabel(" Numero : "+town.getCarrys().get(i).getId()+" | Niveau : "+town.getCarrys().get(i).getLvl()+" | Production au niveau supérieur : "+town.getCarrys().get(i).getProd_utlvlup()+" | Habitants requis au niveau supérieur : "+town.getCarrys().get(i).getHab_needed()+" | Coût en bois pour niveau suivant  : "+town.getCarrys().get(i).getWood_pricelvlup()+" | "),cont);
            cont.gridx=4;
            cont.gridwidth=1;
            int lp=town.getCarrys().get(i).getLvl()+1;
            lvlup_carrys.add(new JButton(" Passer la carriére au niveau : "+lp+" "));
            lvlup_carrys.get(i).addActionListener(this);
            pano.add(lvlup_carrys.get(i),cont);
        }
        
        
        
      
      bar =new JScrollPane(pano);
      panos.setLayout(new BorderLayout());
      panos.add(bar,BorderLayout.CENTER);
       
       this.setContentPane(panos);
       
       
       menubar.add(save);      
       this.setJMenuBar(menubar);
       this.setTitle(town.getName()+" City Tycoon By Crazy_Juju");
      // this.setPreferredSize(pano.getSize());
      // this.pack();
      this.pack();
      this.setVisible(true);
    }
    
    
    public GameWindow(Town town){
        this.town=town;
        
        panos = new JPanel(new GridBagLayout());
        
        cont= new GridBagConstraints();
        cont.fill= GridBagConstraints.BOTH;
        menubar= new JMenuBar();
        save= new JMenu(" Sauvegarder ");
        save.addActionListener(this);
        nb_habfree=new JLabel();
        nb_hab=new JLabel();
        stock_eat=new JLabel();
        stock_gold=new JLabel();
        stock_stone=new JLabel();
        stock_wood=new JLabel();       
        prod_eat=new JLabel();
        prod_wood=new JLabel();
        prod_gold=new JLabel();
        prod_stone=new JLabel();
        lvlup_homes= new ArrayList<>();
        lvlup_mines=new ArrayList<>();
        lvlup_farms= new ArrayList<>();
        lvlup_carrys= new ArrayList<>();
        lvlup_sawmills= new ArrayList<>();
        add_home= new JButton(" Acheter une Maison (-20 bois et -6 nourritures/ut) ");
        add_home.addActionListener(this);
        add_mine= new JButton(" Acheter une Mine (-50 bois,-10 pierres et -2 habitants disponibles) ");
        add_mine.addActionListener(this);
        add_sawmill= new JButton(" Acheter une Scierie (-2 habitants disponibles) ");
        add_sawmill.addActionListener(this);
        add_farm= new JButton(" Acheter une Ferme (-2 habitants disponibles et - 30 bois) ");
        add_farm.addActionListener(this);
        add_carry= new JButton(" Acheter une Carriére (-2 habitants disponibles et -10 bois) ");
        add_carry.addActionListener(this);
       
        
       this.init();
       
        
       
    }

    public void SaveGame(){
        
    }

    public Town getTown() {
        return town;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e.getSource()==save){
           this.SaveGame();
       }
       if(e.getSource()==add_home){

       }
       if(e.getSource()==add_sawmill){
           if(AddController.AddSawMill(town,town.getNb_hab_free())){
               panos.removeAll();
               this.init();
           }
       }
       if(e.getSource()==add_farm){
           if(AddController.AddFarm(town,town.getNb_wood(),town.getNb_hab_free())){
               panos.removeAll();
               this.init();
           }
       }
    
    }
    
    
    public  void update_ressources(){
        town.setNb_food(town.getNb_food()+town.getProd_food());
        town.setNb_wood(town.getNb_wood()+town.getProd_wood());
        town.setNb_gold(town.getNb_gold()+town.getProd_gold());
        town.setNb_stone(town.getNb_stone()+town.getProd_stone());
        panos.removeAll();
        this.init();
       
    } 
}
