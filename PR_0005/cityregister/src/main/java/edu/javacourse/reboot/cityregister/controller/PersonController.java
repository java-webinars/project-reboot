package edu.javacourse.reboot.cityregister.controller;

import edu.javacourse.reboot.cityregister.dto.PersonDto;
import edu.javacourse.reboot.cityregister.manager.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController
{
    @Autowired
    private PersonManager manager;

    @GetMapping(path = "/{personId}")
    public PersonDto getPerson(@PathVariable(name = "personId") Long personId) {
        return manager.getPerson(personId);
    }
}
