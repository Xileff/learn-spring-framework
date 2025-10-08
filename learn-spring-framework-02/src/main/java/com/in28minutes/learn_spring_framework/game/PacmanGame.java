package com.in28minutes.learn_spring_framework.game;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole, AutoCloseable {
    @Override
    public void up() {
        System.out.println("Pacman Up");
    }

    @Override
    public void down() {
        System.out.println("Pacman Down");
    }

    @Override
    public void left() {
        System.out.println("Pacman Left");
    }

    @Override
    public void right() {
        System.out.println("Pacman Right");
    }

    @Override
    public void close() throws Exception {

    }
}
