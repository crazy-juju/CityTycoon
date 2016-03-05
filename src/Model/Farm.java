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
public class Farm {
    private int id,lvl,hab_needed,hab_working;
    private float prod_ut,prod_utlvlup,wood_pricelvlup ;

    public Farm(int id, int lvl,int hab_working, int hab_needed, float prod_ut, float prod_utlvlup, float wood_pricelvlup) {
        this.id = id;
        this.lvl = lvl;
        this.hab_working=hab_working;
        this.hab_needed = hab_needed;
        this.prod_ut = prod_ut;
        this.prod_utlvlup = prod_utlvlup;
        this.wood_pricelvlup = wood_pricelvlup;
    }

    public Farm(int lvl,int hab_working, int hab_needed, float prod_ut, float prod_utlvlup, float wood_pricelvlup) {
        this.lvl = lvl;
        this.hab_working=hab_working;
        this.hab_needed = hab_needed;
        this.prod_ut = prod_ut;
        this.prod_utlvlup = prod_utlvlup;
        this.wood_pricelvlup = wood_pricelvlup;
    }

    
    
    
    
    public int getHab_working() {
        return hab_working;
    }

    public void setHab_working(int hab_working) {
        this.hab_working = hab_working;
    }
    
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHab_needed() {
        return hab_needed;
    }

    public void setHab_needed(int hab_needed) {
        this.hab_needed = hab_needed;
    }

    public float getProd_ut() {
        return prod_ut;
    }

    public void setProd_ut(float prod_ut) {
        this.prod_ut = prod_ut;
    }

    public float getProd_utlvlup() {
        return prod_utlvlup;
    }

    public void setProd_utlvlup(float prod_utlvlup) {
        this.prod_utlvlup = prod_utlvlup;
    }

    public float getWood_pricelvlup() {
        return wood_pricelvlup;
    }

    public void setWood_pricelvlup(float wood_pricelvlup) {
        this.wood_pricelvlup = wood_pricelvlup;
    }
   
}
