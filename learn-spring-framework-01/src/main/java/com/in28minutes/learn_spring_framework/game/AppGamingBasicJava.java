package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        try (final var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
