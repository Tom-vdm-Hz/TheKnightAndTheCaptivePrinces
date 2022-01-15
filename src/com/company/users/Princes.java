package com.company.users;

public class Princes extends Person{

    private String prisonType;


    public Princes(String name, int age, int health, String prisonType) {
        super(name, age, health);
        this.prisonType = prisonType;
    }

    public String getWeaponType() {
        return prisonType;
    }

    public void setWeaponType(String weaponType) {
        this.prisonType = weaponType;
    }

    @Override
    public String toString() {
        return "Princes{" +
                "prisonType='" + prisonType + '\'' +
                '}';
    }
}
