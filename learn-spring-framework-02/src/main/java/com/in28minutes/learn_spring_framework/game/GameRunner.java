package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Component scan will pick up this class and register it as a bean
@Component
public class GameRunner {

    private final GamingConsole game;

    // Autowiring using constructor injection
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game : " + game);

        game.up();
        game.down();
        game.left();
        game.right();
    }
}
