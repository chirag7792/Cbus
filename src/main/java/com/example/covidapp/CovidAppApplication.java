package com.example.covidapp;

import com.example.covidapp.entities.Address;
import com.example.covidapp.entities.Guest;
import com.example.covidapp.repo.AddressRepo;
import com.example.covidapp.repo.GuestRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@Slf4j
@SpringBootApplication
public class CovidAppApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(CovidAppApplication.class, args);
        GuestRepo repo = context.getBean(GuestRepo.class);
        log.info("All Guests", repo.findAll());

//        AddressRepo repo1 = context.getBean(AddressRepo.class);
//        repo1.save(Address.builder()
//                .addressType("house").id(999L).city("Scarborough")
//                .country("Canada").postalCode("m1w3t7").province("on").street("16lesskim")
//                .build());
//
//
//        repo.save(Guest.builder().id(45L).firstName("chirag").lastName("dhawan")
//                        .eMail("123456.com").phone("6476401206")
//                        .purpose("job")
//                .build());


    }

}
