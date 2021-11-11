package com.example.covidapp.service;

import com.example.covidapp.entities.Guest;
import com.example.covidapp.repo.GuestRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestService {
    private final GuestRepo repo;

    public List<Guest> getAll(){
        return repo.findAll();
    }

    public List<Guest> getAllGuests(String firstName, String lastName){
        if(firstName==null && lastName==null){
            return repo.findAll();
        }
        if(firstName==null && lastName!=null){
            return repo.findAllByLastName(lastName);
        }
        if(firstName!=null && lastName==null){
            return repo.findAllByFirstName(firstName);
        }
        return repo.findAllByFirstNameAndLastName(firstName, lastName);
    }

    public Guest createGuest(Guest guest) {
        return repo.save(guest);
    }
}
