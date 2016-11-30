package com; /**
 * Created by alex on 12/11/16.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
///**
// * Implicitly defines a base “search package” for certain items.
// * For example, if you are writing a JPA application, the package
// * of the @EnableAutoConfiguration annotated class will be used
// * to search for @Entity items.
// */
//@EnableAutoConfiguration
///**
// * To find your beans (@Component, @Service, @Repository, @Controller)
// */
//@ComponentScan
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}