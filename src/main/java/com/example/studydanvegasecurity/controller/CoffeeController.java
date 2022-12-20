package com.example.studydanvegasecurity.controller;

import com.example.studydanvegasecurity.entity.Coffee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.example.studydanvegasecurity.enums.Size.*;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {

    private final List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Caffe Americano", GRANDE));
        coffeeList.add(new Coffee(2, "Caffe Lette", VENTI));
        coffeeList.add(new Coffee(3, "Caffe Caramel Macchiato", TALL));
    }

    @RequestMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee.id().equals(id));
    }

}
