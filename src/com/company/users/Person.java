package com.company.users;

import java.util.Random;

abstract class Person {

    private String name;
    private int age;
    private int health;

    public Person(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public int randomizer(){
        Random r = new Random();
        int low = 1;
        int high = 100;
        return r.nextInt(high-low) + low;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                '}';
    }
}
