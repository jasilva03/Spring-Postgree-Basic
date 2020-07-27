package com.example.springbootpostress.repositories;

import com.example.springbootpostress.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {



}
