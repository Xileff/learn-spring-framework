package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    @Bean
    public GamingConsole pacmanGame() {
        return new PacmanGame();
    }
}
