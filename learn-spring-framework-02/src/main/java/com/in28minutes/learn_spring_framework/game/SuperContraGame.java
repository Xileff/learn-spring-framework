package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier") // A specific bean should be autowired (by the name of the bean)
public class SuperContraGame implements GamingConsole, AutoCloseable {
    public void up() {
        System.out.println("Contra Up");
    }

    public void down() {
        System.out.println("Contra down");
    }

    public void left() {
        System.out.println("Contra back");
    }

    public void right() {
        System.out.println("Contra shoot a bullet");
    }

    @Override
    public void close() throws Exception {

    }
}
