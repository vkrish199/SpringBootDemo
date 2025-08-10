package com.varun.app;

import com.varun.app.models.Alien;
import com.varun.app.models.Laptop;
import com.varun.app.services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
//        new SpringBootDemoApplication().gettingStarted(args);
        new SpringBootDemoApplication().differentLayers(args);
    }

    public void differentLayers(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SpringBootDemoApplication.class, args);

        LaptopService ls = context.getBean(LaptopService.class);

        Laptop l = context.getBean(Laptop.class);

        ls.addLaptop(l);

    }

    public void gettingStarted(String[] args) {
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
