package com.in28minutes.learn_spring_framework.helloworld;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {}

record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "World";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Primary
    @Bean(name = "address")
    public Address address() {
        return new Address("123 Main Street", "London");
    }

    @Bean(name = "address2")
    public Address address2() {
        return new Address("Address 2", "London 2");
    }

    @Bean
    @Qualifier("address3")
    public Address address3() {
        return new Address("Address 3", "London 3");
    }

    @Bean
    public Person person() { // hardcoded values
        return new Person("John", 25, new Address("Hardcoded street", "Hardcoded city"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // using existing beans
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) { // referring to existing beans by their name
        return new Person(name, age, address2);
    }

    @Bean
    public Person person4ConstructorInjection(String name, int age, @Qualifier("address3") Address address) {
        return new Person(name, age, address);
    }
}
