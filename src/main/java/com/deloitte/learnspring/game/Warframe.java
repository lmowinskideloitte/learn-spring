package com.deloitte.learnspring.game;

public class Warframe implements GamingConsole {

    @Override
    public void up() {
        System.out.println("jumpin...");
    }

    @Override
    public void down() {
        System.out.println("crouchin...");
    }

    @Override
    public void right() {
        System.out.println("strafing right...");
    }

    @Override
    public void left() {
        System.out.println("strafing left...");
    }
}
