package com.company.observer;

import com.company.Scanner;
import com.company.story.Story;
import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

public class Game {

    private Scanner scanner;
    private Knight knight;
    private Princes princes;
    private Dragon dragon;
    private int storyState = 0;
    private Story story;
    private boolean playing;

    public Game() {
        this.scanner = new Scanner();
        this.story = new Story();
        this.knight = new Knight("Tom",20, 100, "sword","heavy");
        this.princes = new Princes("Elizabeth", 21, 100, "tower");
        this.dragon = new Dragon("Falkor", 248, 500, "fire");
    }

    private void update() throws InterruptedException {
        if(this.playing){
            if (story.checkStory(knight, princes, dragon)){
                story.setState(story.getState() + 1);
            }else {
                this.playing = false;
            }
            update();
        }else {
            gameOver();
        }
    }

    public void start() throws InterruptedException {
        this.playing = true;
        this.update();
    }

    public void gameOver(){
        System.out.println("Game Over");
    }

    public void gameWon(){
        System.out.println("Game Won");
    }
}
