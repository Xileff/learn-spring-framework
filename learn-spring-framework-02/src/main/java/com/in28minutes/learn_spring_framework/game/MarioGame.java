package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // A bean should be given preference if multiple beans are present
public class MarioGame implements GamingConsole, AutoCloseable {
    public void up() {
        System.out.println("Mario up");
    }

    public void down() {
        System.out.println("Mario down");
    }

    public void left() {
        System.out.println("Mario left");
    }

    public void right() {
        System.out.println("Mario right");
    }

    @Override
    public void close() throws Exception {

    }
}
