package com.deloitte.learnspring.game;

public class Minecraft implements GamingConsole {

    @Override
    public void up() {
        System.out.println("jumpin...");
    }

    @Override
    public void down() {
        System.out.println("diggin...");
    }

    @Override
    public void right() {
        System.out.println("walkin right...");
    }

    @Override
    public void left() {
        System.out.println("walkin left...");
    }
}
