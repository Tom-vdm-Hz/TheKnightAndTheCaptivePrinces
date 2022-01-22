package com.company.observer;

import com.company.Scanner;
import com.company.factories.DragonFactory;
import com.company.factories.KnightFactory;
import com.company.factories.PrincessFactory;
import com.company.story.Story;
import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

public class Game {

    private Scanner scanner;
    private Knight knight;
    private Princes princes;
    private Dragon dragon;
    private Story story;
    private boolean playing;

    public Game() {
        this.scanner = new Scanner();
        this.story = new Story();
        this.princes = new PrincessFactory().createPrincess();
        this.dragon = new DragonFactory().createDragon();
    }

    private void update() throws InterruptedException {
        if(this.playing){
            boolean canContinue =  story.checkStory(knight, princes, dragon);
            if (canContinue){
                story.setState(story.getState() + 1);
                if (story.getState() == 7){
                    gameWon();
                }
            }else if(canContinue == false){
                this.playing = false;
            }
            update();
        }else {
            gameOver();
        }
    }

    public void start() throws InterruptedException {
        this.playing = true;
        this.knight = new KnightFactory().createKnight();
        this.update();
    }

    public void gameOver(){
        System.out.println("Game Over");
    }

    public void gameWon(){
        System.out.println("Game Won");
    }
}
