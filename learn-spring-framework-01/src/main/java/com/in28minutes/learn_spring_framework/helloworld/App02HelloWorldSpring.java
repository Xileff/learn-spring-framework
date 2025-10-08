package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    // JVM
    public static void main(String[] args) {


        // 1. Spring context
        try (final var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. Config everything for spring to manage - @Configuration

            //  3. Retrieve bean from spring context
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person4ConstructorInjection"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean(Address.class));
        }
    }
}
