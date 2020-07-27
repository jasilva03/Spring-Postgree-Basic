package com.example.springbootpostress.bootstrap;

import com.example.springbootpostress.model.Person;
import com.example.springbootpostress.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //personRepository.deleteAll();

        Person p1 = new Person("Arnaldo", "Ortega");
        Person p2 = new Person("Patron", "Bermudez");

        List<Person> personList = Arrays.asList(p1, p2);

        personRepository.saveAll(personList);

    }

}
