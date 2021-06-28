package com.dio.personapi.controller;

import com.dio.personapi.dto.MessageResponseDTO;
import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.entity.Person;
import com.dio.personapi.repository.PersonRepository;
import com.dio.personapi.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }
}
