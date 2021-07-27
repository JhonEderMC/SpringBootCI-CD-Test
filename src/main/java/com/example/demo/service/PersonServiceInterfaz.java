package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonServiceInterfaz {
    List<Person> getAll();
    Person save(Person person);
}
