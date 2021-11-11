package com.example.covidapp.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Table_Address")
@Entity
public class Address {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String addressType;
    private String street;
    private String city;
    private String province;
    private String country;
    private String postalCode;


}
