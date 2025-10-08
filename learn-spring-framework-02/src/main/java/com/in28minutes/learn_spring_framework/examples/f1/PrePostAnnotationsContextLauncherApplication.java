package com.in28minutes.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass {
    private final SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("SomeClass instantiated");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Clean up");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("someDependency getReady");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        try (
                final var context =
                        new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)
        ) {
            context.getBean(SomeClass.class);
        }
    }
}
