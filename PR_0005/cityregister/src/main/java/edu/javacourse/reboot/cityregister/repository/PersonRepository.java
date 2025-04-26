package edu.javacourse.reboot.cityregister.repository;

import edu.javacourse.reboot.cityregister.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>
{
}
