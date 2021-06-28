package com.dio.personapi.service;

import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.entity.Person;
import com.dio.personapi.mapper.PersonMapper;
import com.dio.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDTO createPerson(PersonDTO personDTO){

        Person savedPerson = personRepository.save(
                personMapper.toModel(personDTO));

        return personMapper.toDTO(savedPerson);

    }
}
