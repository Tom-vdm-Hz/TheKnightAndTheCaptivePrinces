package com.company.factories;

import com.company.Scanner;
import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

public class KnightFactory implements abstractFactory{
    private Scanner scanner = new Scanner();


    public Dragon createDragon() {
        return null;
    }

    @Override
    public Knight createKnight() {
        System.out.println("Welkom dappere ridder, wat is je naam?");
        String name = scanner.readLine();
        System.out.println("Hoe oud ben je, dappere ridder?");
        int age = Integer.parseInt(scanner.readLine());
        System.out.println("Wat is een ridder zonder een harnas, maar voor je een harnas kiest moet ik wel wat uitleg geven");
        System.out.println("er zijn 3 verschillende soorten maar elke soort heeft andere eigenschappen.");
        System.out.println("laten we beginnen met geen harnas aandoet wordt je altijd voor de volledige damage geraakt het is " +
                "daarom aanbevolen om altijd wel een harnas aan te doen.");
        System.out.println("We hebben ook light harnas, houd je goed op de been maar beschermt je niet heel goed (60% kans om te blokken voor half damage).");
        System.out.println("Daarna komt medium harnas, is een wat zwaarder harnas maar beschermt je wel beter (40% kans om te blokken voor een derde van de damage).");
        System.out.println("Tot slot hebben we ook nog heavy harnas, is ons beste en zwaarste harnas het beschermt je het beste" +
                "maar omdat die zo zwaar is kan je niet makkelijk iets blokken (20% kans om te blokken voor een vierde deel van de damage).");
        System.out.println(
                "Dus welk soort harnas wil je voor de strijd? (none, light, medium, heavy)");
        String armourType = scanner.readLine();


        System.out.println("Nu je een harnas hebt is het tijd om ons arsenaal met wapens te bekijken.");
        System.out.println("Ik ben verplicht om iedere ridder te informeren over de wapens hier, dus laten we er meteen aan beginnen.");
        System.out.println("We beginnen met mijn favoriete, de dagger.");
        System.out.println("De dagger heeft een lage damage maar raakt wel altijd (100% kans om te raken voor 25 damage).");
        System.out.println("Daarnaast hebben we het meest gebruikte wapen, het zwaard (sword).");
        System.out.println("Het zwaard heeft is altijd wel een goeie optie met een goeie kans om te raken met wat meer damage (90% kans om te raken voor 70 damage");
        System.out.println("In het midden ligt de longSword, vind hem zelf iets te lang maar ieder zo zn vechtstijl.");
        System.out.println("De longSword is wat lastiger te gebruiken dan het zwaard maar als je raakt raak je wel goed (70% kans om te raken voor 100 damage).");
        System.out.println("Dan komen we bij de oude vertrouwde axe!");
        System.out.println("de axe is wat fijner te gebruiken dan een longSword maar doet wel wat minder damage (80% kans om te raken voor 80 damage).");
        System.out.println("Dan komen we nu bij het laatste wapen, weer zn groot ding, de battleAxe.");
        System.out.println("Met de battleAxe doe je de meeste damage maar omdat die zo groot is, is die ook erg lastig te gebruiken (60% kans om te raken voor 150 damage).");
        System.out.println("Nu je alle wapens gezien hebt dappere ridder, welke kies je? (dagger, sword, longsword, axe, battleAxe)");
        String weaponType = scanner.readLine();

        return new Knight(name,age, 100, weaponType,armourType);
    }


    public Princes createPrincess() {
        return null;
    }
}
