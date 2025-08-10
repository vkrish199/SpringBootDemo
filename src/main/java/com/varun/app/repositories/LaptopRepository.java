package com.varun.app.repositories;

import com.varun.app.models.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved Laptop");
    }

}
