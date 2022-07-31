package com.deloitte.learnspring.game;

public class GameRunner {
    private Warframe game;
    public GameRunner(Warframe game) {
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
