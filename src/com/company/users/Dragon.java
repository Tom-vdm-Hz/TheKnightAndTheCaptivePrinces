package com.company.users;

import java.util.Random;

public class Dragon extends Person{

    private String damageType;


    public Dragon(String name, int age, int health, String damageType) {
        super(name, age, health);
        this.damageType = damageType;
    }

    public void doesDamage(Knight knight){
        switch (damageType){
            case "fire":
                if (attackSuccess(90)){
                    knight.takesDamage(20);
                }
                break;
            case "ice":
                if (attackSuccess(70)){
                    knight.takesDamage(30);
                }
                break;
            case "electric":
                if (attackSuccess(50)){
                    knight.takesDamage(60);
                }
        }
    }

    private boolean attackSuccess(int percentage){
        if(this.randomizer() < percentage){
            System.out.println("aanval van draak "+this.getName()+" gelukt");
            return true;
        } else {
            System.out.println("aanval van draak "+this.getName()+" gefaald");
            return false;
        }
    }

    public void takesDamage(int damageAmount){
        int healthAfterDamage = this.getHealth() - damageAmount;
        if(healthAfterDamage > 0){
            this.setHealth(healthAfterDamage);
            System.out.println("draak "+this.getName()+" heeft " + damageAmount + " schade genomen");
            System.out.println("huidige levens van draak " + this.getName() + ": "  + this.getHealth());
        }else {
            this.setHealth(0);
            System.out.println(this.getName() + " heeft te veel schade genomen");
            System.out.println(this.getName() + " overleed");
        }
    }

    public String damageType() {
        return damageType;
    }

    public void damageType(String damageType) {
        this.damageType = damageType;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "damageType='" + damageType + '\'' +
                '}';
    }
}
