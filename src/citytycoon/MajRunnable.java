/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citytycoon;

import Model.Town;
import View.GameWindow;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julien
 */
public class MajRunnable implements Runnable {
    
    private GameWindow gw  ;
    
    public MajRunnable(GameWindow gw){
        
        this.gw=gw;
    }
    
    @Override
    public void run()  {
        Town town = gw.getTown();
        try{
        while(true){
            gw.update_ressources();
            Thread.sleep(10000);
            
        }
        } catch (InterruptedException ex) {
            Logger.getLogger(MajRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    

}
