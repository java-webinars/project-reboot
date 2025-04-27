package edu.javacourse.reboot.cityregister.manager;

import edu.javacourse.reboot.cityregister.domain.Person;
import edu.javacourse.reboot.cityregister.dto.PersonDto;
import edu.javacourse.reboot.cityregister.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonManager
{
    @Autowired
    private PersonRepository repository;

    public PersonDto getPerson(Long personId) {
        Person person = repository.findById(personId).get();
        return new PersonDto(person);
    }
}
