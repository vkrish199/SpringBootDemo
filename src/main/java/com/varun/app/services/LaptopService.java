package com.varun.app.services;

import com.varun.app.models.Laptop;
import com.varun.app.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository lr;

    public void addLaptop(Laptop lap) {
        lr.save(lap);
    }

}
