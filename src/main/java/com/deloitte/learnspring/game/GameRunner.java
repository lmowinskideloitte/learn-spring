package com.deloitte.learnspring.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        game.up();
        game.down();
        game.right();
        game.right();
        game.left();
    }
}
