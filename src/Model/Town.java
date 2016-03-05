/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;




/**
 *
 * @author julien
 */
public class Town {
    private String name;
    private ArrayList<Home> homes;
    private ArrayList<Mine> mines;
    private ArrayList<Farm> farms;
    private ArrayList<Carry> carrys;
    private ArrayList<SawMill> sawmills;
    private int nb_hab,nb_hab_free,nb_home,nb_mine,nb_farm,nb_carry,nb_sawmill;
    private float nb_wood,nb_food,nb_stone,nb_gold,prod_wood,prod_stone,prod_gold,prod_food,augment_rate_prod,augment_rate_hab;

    public Town() {
        homes=new ArrayList<>();
        mines=new ArrayList<>();
        farms=new ArrayList<>();
        carrys=new ArrayList<>();
        sawmills=new ArrayList<>();
        augment_rate_prod=(float) 1.05;
        augment_rate_hab=(float) 1.05;
        prod_food=200;
        nb_wood=100;
        
        
    }

    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
    
    
    
    
    
    


    public ArrayList<Home> getHomes() {
        return homes;
    }

    public void setHomes(ArrayList<Home> homes) {
        this.homes = homes;
    }

    public ArrayList<Mine> getMines() {
        return mines;
    }

    public void setMines(ArrayList<Mine> mines) {
        this.mines = mines;
    }

    public ArrayList<Farm> getFarms() {
        return farms;
    }

    public void setFarms(ArrayList<Farm> farms) {
        this.farms = farms;
    }

    public ArrayList<Carry> getCarrys() {
        return carrys;
    }

    public void setCarrys(ArrayList<Carry> carrys) {
        this.carrys = carrys;
    }

    public ArrayList<SawMill> getSawmills() {
        return sawmills;
    }

    public void setSawmills(ArrayList<SawMill> sawmills) {
        this.sawmills = sawmills;
    }

    public int getNb_hab() {
        return nb_hab;
    }

    public void setNb_hab(int nb_hab) {
        this.nb_hab = nb_hab;
    }

    public int getNb_hab_free() {
        return nb_hab_free;
    }

    public void setNb_hab_free(int nb_hab_free) {
        this.nb_hab_free = nb_hab_free;
    }

    public int getNb_home() {
        return nb_home;
    }

    public void setNb_home(int nb_home) {
        this.nb_home = nb_home;
    }

    public int getNb_mine() {
        return nb_mine;
    }

    public void setNb_mine(int nb_mine) {
        this.nb_mine = nb_mine;
    }

    public int getNb_farm() {
        return nb_farm;
    }

    public void setNb_farm(int nb_farm) {
        this.nb_farm = nb_farm;
    }

    public int getNb_carry() {
        return nb_carry;
    }

    public void setNb_carry(int nb_carry) {
        this.nb_carry = nb_carry;
    }

    public int getNb_sawmill() {
        return nb_sawmill;
    }

    public void setNb_sawmill(int nb_sawmill) {
        this.nb_sawmill = nb_sawmill;
    }

    public float getNb_wood() {
        return nb_wood;
    }

    public void setNb_wood(float nb_wood) {
        this.nb_wood = nb_wood;
    }

    public float getNb_food() {
        return nb_food;
    }

    public void setNb_food(float nb_food) {
        this.nb_food = nb_food;
    }

    public float getNb_stone() {
        return nb_stone;
    }

    public void setNb_stone(float nb_stone) {
        this.nb_stone = nb_stone;
    }

    public float getNb_gold() {
        return nb_gold;
    }

    public void setNb_gold(float nb_gold) {
        this.nb_gold = nb_gold;
    }

    public float getProd_wood() {
        return prod_wood;
    }

    public void setProd_wood(float prod_wood) {
        this.prod_wood = prod_wood;
    }

    public float getProd_stone() {
        return prod_stone;
    }

    public void setProd_stone(float prod_stone) {
        this.prod_stone = prod_stone;
    }

    public float getProd_gold() {
        return prod_gold;
    }

    public void setProd_gold(float prod_gold) {
        this.prod_gold = prod_gold;
    }

    public float getProd_food() {
        return prod_food;
    }

    public void setProd_food(float prod_food) {
        this.prod_food = prod_food;
    }

    public float getAugment_rate_prod() {
        return augment_rate_prod;
    }

    public void setAugment_rate_prod(float augment_rate_prod) {
        this.augment_rate_prod = augment_rate_prod;
    }

    public float getAugment_rate_hab() {
        return augment_rate_hab;
    }

    public void setAugment_rate_hab(float augment_rate_hab) {
        this.augment_rate_hab = augment_rate_hab;
    }
    
}
