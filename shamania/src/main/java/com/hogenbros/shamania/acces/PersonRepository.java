package com.hogenbros.shamania.acces;

import com.hogenbros.shamania.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonById(Long taskId);
}