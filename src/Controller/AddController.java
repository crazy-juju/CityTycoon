/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carry;
import Model.Farm;
import Model.Home;
import Model.Mine;
import Model.SawMill;
import Model.Town;
import View.ErrorPopUp;

/**
 *
 * @author julien
 */
public class AddController {
    
    
    public static boolean AddHome(Town town ,float nb_wood,float prod_eat){
        if((prod_eat<(float)6.0) || (nb_wood<(float)20)){
            ErrorPopUp ep= new ErrorPopUp(" Pas assez de ressources pour construire une maison ! ");
            return false;
        }else{
            town.getHomes().add(new Home(town.getNb_home(),1,4,6,6,9,10));
            town.setNb_home(town.getNb_home()+1);
            town.setNb_wood(town.getNb_wood()-20);
            town.setProd_food((float) (town.getProd_food()-6.0));
            town.setNb_hab(town.getNb_hab()+4);
            town.setNb_hab_free(town.getNb_hab_free()+4);
            return true;
        }        
    }
    
    public static boolean AddFarm(Town town,float nb_wood,int hab_needed){
        if(2>hab_needed || 30>nb_wood){
            ErrorPopUp ep= new ErrorPopUp(" Pas assez de ressources pour construire une ferme ! ");
            return false;
        }else{
         town.getFarms().add(new Farm(town.getNb_farm(),1,2,4,(float)0.4,(float)0.2,20));
         town.setNb_farm(town.getNb_farm()+1);
         town.setNb_hab_free(town.getNb_hab_free()-2);
         town.setProd_food(town.getProd_food()+(float)0.2);
         town.setNb_wood(town.getNb_wood()-30);
         return true;
        }
    }
    
    public static boolean AddSawMill(Town town,int hab_needed){
        if(2>hab_needed){
            ErrorPopUp ep= new ErrorPopUp(" Pas assez de ressources pour construire une scierie ! ");
            return false;
        }else{
            town.getSawmills().add(new SawMill(town.getNb_sawmill(),1, 4,2,(float)0.25, (float) 0.5));
            town.setNb_sawmill(town.getNb_sawmill()+1);
            town.setNb_hab_free(town.getNb_hab_free()-2);
            town.setProd_wood(town.getProd_wood()+(float)0.25);
            return true;
        }
    }
    
    public static boolean AddCarry (Town town,int hab_needed,float nb_wood){
        if(2>hab_needed || nb_wood<10){
            ErrorPopUp ep= new ErrorPopUp(" Pas assez de ressources pour construire une carriére ! ");
            return false;
        }else{
            town.getCarrys().add(new Carry(town.getNb_carry(),1,4,2,(float)0.25,(float)0.5,15));
            town.setNb_carry(town.getNb_carry()+1);
            town.setNb_hab_free(town.getNb_hab_free()-2);
            town.setNb_wood(town.getNb_wood()-10);
            town.setProd_stone(town.getProd_stone()+(float)0.25);
            return true ;
        }
    }
    
    public static boolean AddMine(Town town,int hab_needed,float nb_wood,float nb_stone){
        if(2>hab_needed || nb_wood<50 || nb_stone<10){
            ErrorPopUp ep= new ErrorPopUp(" Pas assez de ressources pour construire une mine ! ");
            return false;
        }else{
            town.getMines().add(new Mine(town.getNb_mine(),1,2,4,(float)0.1,(float) 0.2,75,15));
            town.setNb_mine(town.getNb_mine()+1);
            town.setProd_gold(town.getProd_gold()+(float)0.1);
            town.setNb_hab_free(town.getNb_hab_free()-2);
            town.setNb_stone(town.getNb_stone()-10);
            town.setNb_wood(town.getNb_wood()-50);
            return true;
        }
    }
    
    
}
