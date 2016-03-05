/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author julien
 */
public class Home {
    private int id,level,nb_hab,nb_hablvlup;
    private float eat_needed,eat_neededlvlup,wood_pricelvlup;

    public Home(int id, int level, int nb_hab, int nb_hablvlup, float eat_needed, float eat_neededlvlup,float wood_pricelvlup) {
        this.id = id;
        this.level = level;
        this.nb_hab = nb_hab;
        this.nb_hablvlup = nb_hablvlup;
        this.eat_needed = eat_needed;
        this.eat_neededlvlup = eat_neededlvlup;
        this.wood_pricelvlup= wood_pricelvlup;
    }

    public Home(int level, int nb_hab, int nb_hablvlup, float eat_needed, float eat_neededlvlup,float wood_pricelvlup) {
        this.level = level;
        this.nb_hab = nb_hab;
        this.nb_hablvlup = nb_hablvlup;
        this.eat_needed = eat_needed;
        this.eat_neededlvlup = eat_neededlvlup;
        this.wood_pricelvlup= wood_pricelvlup;
    }

    public float getWood_pricelvlup() {
        return wood_pricelvlup;
    }

    public void setWood_pricelvlup(float wood_pricelvlup) {
        this.wood_pricelvlup = wood_pricelvlup;
    }

    
   
    
    public float getEat_needed() {
        return eat_needed;
    }

    public void setEat_needed(float eat_needed) {
        this.eat_needed = eat_needed;
    }

    public float getEat_neededlvlup() {
        return eat_neededlvlup;
    }

    public void setEat_neededlvlup(float eat_neededlvlup) {
        this.eat_neededlvlup = eat_neededlvlup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNb_hab() {
        return nb_hab;
    }

    public void setNb_hab(int nb_hab) {
        this.nb_hab = nb_hab;
    }

    public int getNb_hablvlup() {
        return nb_hablvlup;
    }

    public void setNb_hablvlup(int nb_hablvlup) {
        this.nb_hablvlup = nb_hablvlup;
    }
    
    
}
