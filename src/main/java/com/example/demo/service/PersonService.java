package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonServiceInterfaz {

    @Autowired
    PersonRepositoryInterface repositoryInterface;

    public List<Person> getAll(){
        return repositoryInterface.findAll();
    }

    public Person  save(Person person){
        return repositoryInterface.save(person);
    }


}
