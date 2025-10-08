package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // spring context will be created from this class
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class GamingAppLauncher {
    public static void main(String[] args) {
        try (
                final var context =
                        new AnnotationConfigApplicationContext(GamingAppLauncher.class)
        ) {
            context.getBean(GameRunner.class).run();
        }
    }
}
