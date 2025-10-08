package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole, AutoCloseable {
    public void up() {
        System.out.println("Go up");
    }

    public void down() {
        System.out.println("Go down");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go right");
    }

    @Override
    public void close() throws Exception {

    }
}
