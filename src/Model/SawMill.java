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
public class SawMill {
    private int id,lvl,hab_needed,hab_working ;
   private float prod_ut,prod_utlvlup;

    public SawMill(int id, int lvl, int hab_needed, int hab_working, float prod_ut, float prod_utlvlup) {
        this.id = id;
        this.lvl = lvl;
        this.hab_needed = hab_needed;
        this.hab_working = hab_working;
        this.prod_ut = prod_ut;
        this.prod_utlvlup = prod_utlvlup;
    }

    public SawMill(int lvl, int hab_needed, int hab_working, float prod_ut, float prod_utlvlup) {
        this.lvl = lvl;
        this.hab_needed = hab_needed;
        this.hab_working = hab_working;
        this.prod_ut = prod_ut;
        this.prod_utlvlup = prod_utlvlup;
    }
   
   
   
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getHab_needed() {
        return hab_needed;
    }

    public void setHab_needed(int hab_needed) {
        this.hab_needed = hab_needed;
    }

    public int getHab_working() {
        return hab_working;
    }

    public void setHab_working(int hab_working) {
        this.hab_working = hab_working;
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
   
}
