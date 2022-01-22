package com.company.users;

import java.util.Random;

public class Knight extends Person{

    private String weaponType;
    private String armourType;


    public Knight(String name, int age, int health, String swordType, String armourType) {
        super(name, age,health);
        this.weaponType = swordType;
        this.armourType = armourType;
    }

    public void doesDamage(Dragon dragon){
        switch (this.weaponType){
            case "dagger":
                if (attackSuccess(100)){
                    dragon.takesDamage(25);
                }
                break;
            case "sword":
                if (attackSuccess(90)){
                    dragon.takesDamage(70);
                }
                break;
            case "longSword":
                if (attackSuccess(70)){
                    dragon.takesDamage(100);
                }
                break;
            case "axe":
                if (attackSuccess(80)){
                    dragon.takesDamage(80);
                }
                break;
            case "battleAxe":
                if (attackSuccess(60)){
                    dragon.takesDamage(150);
                }
                break;
        }
    }

    private boolean attackSuccess(int percentage){
        if(this.randomizer() < percentage){
            System.out.println("aanval van ridder "+this.getName()+" gelukt");
            return true;
        } else {
            System.out.println("aanval van ridder "+this.getName()+" gefaald");
            return false;
        }
    }

    public void takesDamage(int damageAmount){
        int damageTaken = damageAmount;
        switch (this.armourType){
            case "none":
                damageTaken = damageAmount;
                break;
            case "light":
                if (armourSucceeds(60)){
                    damageTaken = (damageAmount / 2);
                }
                break;
            case "medium":
                if (armourSucceeds(40)){
                    damageTaken = (damageAmount / 3);
                }
                break;
            case "heavy":
                if (armourSucceeds(20)){
                    damageTaken = (damageAmount / 4);
                }
                break;
        }
        int healthAfterDamage = this.getHealth() - damageTaken;
        if(healthAfterDamage > 0){
            this.setHealth(healthAfterDamage);
            System.out.println("ridder "+this.getName()+" heeft " + damageTaken + " schade genomen");
            System.out.println("huidige levens van ridder " + this.getName() + ": "  + this.getHealth());
        }else {
            this.setHealth(0);
            System.out.println(this.getName() + " heeft te veel schade genomen");
            System.out.println(this.getName() + " overleed");
        }
    }

    private boolean armourSucceeds(int percentage){
        if(this.randomizer() < percentage){
            System.out.println("armour van ridder "+this.getName()+" gelukt");
            return true;
        } else {
            System.out.println("armour van ridder "+this.getName()+" gefaald");
            return false;
        }
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "weaponType='" + weaponType + '\'' +
                ", armourType='" + armourType + '\'' +
                '}';
    }
}
