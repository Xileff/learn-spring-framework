package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA {
    public ClassA() {
        System.out.println("Init class A");
    }
}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Init class B");
        // Some logic
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Class B do something");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (LazyInitializationLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            context.getBean(ClassB.class).doSomething();
        }
    }
}
