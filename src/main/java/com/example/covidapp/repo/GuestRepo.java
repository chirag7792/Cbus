package com.example.covidapp.repo;

import com.example.covidapp.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface GuestRepo extends JpaRepository<Guest, Long> {

    List<Guest> findAllByFirstName(String firstName);
    List<Guest> findAllByLastName(String lastName);
    List<Guest> findAllByFirstNameAndLastName(String firstName, String LastName);
}
