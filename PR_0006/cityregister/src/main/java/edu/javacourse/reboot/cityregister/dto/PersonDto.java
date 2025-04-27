package edu.javacourse.reboot.cityregister.dto;

import edu.javacourse.reboot.cityregister.domain.Person;

public class PersonDto
{
    private Long personId;
    private String firstName;
    private String lastName;

    public PersonDto() {
    }

    public PersonDto(Person person) {
        this.personId = person.getPersonId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
