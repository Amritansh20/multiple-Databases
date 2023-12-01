package com.example.demo;

import com.example.demo.authorDb.Author;
import com.example.demo.personDb.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ServiceProvider servive;

    @PostMapping("/addPerson")
    public Person addPerson( @RequestBody  Person person){
            return servive.addPerson(person);
    }


    @PostMapping("/addAuthor")
    public Author addPerson(@RequestBody Author author){
        return servive.addAuthor(author);
    }

}
