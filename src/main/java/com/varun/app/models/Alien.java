package com.varun.app.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//By using component annotation we can tell Spring to manage this object
@Component
public class Alien {
    //By Using autowired, we are creating a wiring between Alien and Laptop
    //Now spring will automatically inject laptop object - Dependency Injection
    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }

}
