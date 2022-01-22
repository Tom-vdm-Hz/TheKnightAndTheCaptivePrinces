package com.company;

import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

public class Main {

    public static void main(String[] args) {
        Knight k = new Knight("Tom",20, 100, "sword","heavy");
        Princes p = new Princes("Elizabeth", 21, 100, "tower");
        Dragon d = new Dragon("Falkor", 248, 500, "fire");
        Scanner s = new Scanner();

        System.out.println(k);
        System.out.println(p);
        System.out.println(d);
        System.out.println("--------------------------------------------------");
        k.doesDamage(d);
        System.out.println("--------------------------------------------------");
        d.doesDamage(k);
        System.out.println("--------------------------------------------------");
        k.doesDamage(d);
        System.out.println("--------------------------------------------------");
        d.doesDamage(k);
        System.out.println("--------------------------------------------------");
        k.doesDamage(d);
        System.out.println("--------------------------------------------------");
        d.doesDamage(k);
        System.out.println("--------------------------------------------------");

        s.readLine();
    }
}
