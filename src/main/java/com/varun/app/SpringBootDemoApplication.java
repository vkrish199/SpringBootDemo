package com.varun.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SpringBootDemoApplication.class, args);

        System.out.println("Hello World");

        //we can use context getBean
        //Spring will create the object inside the container
        //dependency injection
        Alien obj = context.getBean(Alien.class);
        obj.code();
    }
}
