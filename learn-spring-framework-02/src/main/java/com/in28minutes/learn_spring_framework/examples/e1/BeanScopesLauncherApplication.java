package com.in28minutes.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


// Singleton : one object instance per spring ioc container
@Component
class NormalClass {}

// Prototype : new object instance per every request
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtoTypeClass {}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (BeanScopesLauncherApplication.class)) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
        }
    }
}
