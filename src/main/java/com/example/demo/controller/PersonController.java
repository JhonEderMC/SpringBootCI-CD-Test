package com.example.demo.controller;


import com.example.demo.entity.Person;

import com.example.demo.service.PersonServiceInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    PersonServiceInterfaz personService;

    @GetMapping()
    public Iterable<Person> getAll(){
        return personService.getAll();
    }

    @PostMapping()
    public Person save(@RequestBody Person person){
        System.out.println(person);
        return personService.save(person);
    }

}
