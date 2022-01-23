package com.company.story;

import com.company.Scanner;
import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

import java.util.concurrent.TimeUnit;

public class Story {

    private Scanner scanner;
    private int state;

    public Story() {
        this.scanner = new Scanner();
        this.state = 1;
    }

    public boolean checkStory(Knight knight, Princes princes, Dragon dragon) throws InterruptedException {
        switch (this.state){
            case 1:
               return chapter1(knight,princes);
            case 2:
                return chapter2(knight,princes);
            case 3:
                return chapter3(knight, dragon);
            case 4:
                return chapter4(knight, dragon);
            case 5:
                return chapter5(knight,princes);
            case 6:
                return chapter6(princes);
        }
        return false;
    }

    public boolean toBool(String s){
        if (s.equals("ja")){
            return true;
        }else if(s.equals("nee")){
            return false;
        }
        return false;
    }

    private String battler(Knight knight, Dragon dragon) throws InterruptedException {
        boolean battling = true;
        while (battling){
            if (knight.getHealth() == 0){
                return "nee";
            }else if(dragon.getHealth() == 0){
                return "ja";
            }
            System.out.println("--------------------------------------------------");
            knight.doesDamage(dragon);
            TimeUnit.SECONDS.sleep(6);
            if (knight.getHealth() == 0){
                return "nee";
            }else if(dragon.getHealth() == 0){
                return "ja";
            }
            System.out.println("--------------------------------------------------");
            dragon.doesDamage(knight);
            TimeUnit.SECONDS.sleep(6);
        }
    return "";
    }

    private boolean chapter1(Knight knight, Princes princes){
        System.out.println("Welkom "+knight.getName()+", jouw grote liefde, princes "+princes.getName()+" is gevangen genomen, jou doel is om haar te bevrijden!");
        System.out.println("Wil je princes "+princes.getName()+" bevrijden? (antwoord ja of nee)");
        if(toBool(scanner.readLine())){
            return true;
        }
        return false;
    }

    private boolean chapter2(Knight knight, Princes princes) throws InterruptedException {
        System.out.println("princes "+princes.getName()+" is gevangen genomen in een "+princes.getPrisonType()+", ridder "+knight.getName()+" vertrekt direct");
        TimeUnit.SECONDS.sleep(3);
        return true;
    }
    private boolean chapter3(Knight knight, Dragon dragon) throws InterruptedException {
        System.out.println("O nee, ridder " +knight.getName()+" komt draak " +dragon.getName()+ " met "+dragon.damageType()+" damage tegen");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Gaat ridder " +knight.getName()+" de draak vechten (antwoord ja of nee)");
        if(toBool(scanner.readLine())){
            return true;
        }
        return false;
    }
    private boolean chapter4(Knight knight, Dragon dragon) throws InterruptedException {
        System.out.println("Gevecht wordt gestart.......");
        TimeUnit.SECONDS.sleep(4);
        if (toBool(battler(knight, dragon))){
            System.out.println("ridder "+knight.getName()+ " heeft de draak verslagen");
            return true;
        }else {
            System.out.println("draak "+dragon.getName()+ " heeft ridder "+knight.getName()+" verslagen");
            return false;
        }
    }
    private boolean chapter5(Knight knight, Princes princes) throws InterruptedException {
        System.out.println("ridder "+knight.getName()+ " vervolgt zijn zoektoecht voor princes "+princes.getName());
        TimeUnit.SECONDS.sleep(4);
        System.out.println("even later ziet ridder "+knight.getName()+ " de toren waar princes "+princes.getName() +" gevangen wordt gehouden,");
        System.out.println("en gaat hier direct naartoe");
        return true;
    }
    private boolean chapter6(Princes princes) throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("eenmaal aangekomen bij princes "+princes.getName()+",");
        System.out.println("red hij haar van de toren en heeft hij gewonnen");
        return true;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
