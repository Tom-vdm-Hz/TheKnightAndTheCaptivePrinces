package com.company;

import com.company.observer.Game;
import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.start();
    }
}
