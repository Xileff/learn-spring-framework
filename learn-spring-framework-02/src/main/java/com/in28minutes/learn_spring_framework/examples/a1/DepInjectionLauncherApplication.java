package com.in28minutes.learn_spring_framework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Kinds of Dependency Injection :
// 1. Field injection
// 2. Constructor Injection
// 3. Setter Injection

@Component
class YourBusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired // constructor injection will still work without this annotation
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using Dependency1 : " + dependency1 + " and Dependency2 : " + dependency2;
    }



    // Setter Injection
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter injection - setDependency2");
//        this.dependency2 = dependency2;
//    }
}

@Component
class Dependency1 {}

@Component
class Dependency2 {}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try (
                final var context =
                        new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
