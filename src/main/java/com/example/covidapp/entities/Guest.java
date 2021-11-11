package com.example.covidapp.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Table_Guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @JoinColumn (name = "address_id")
    @OneToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private  Address address;
    private String email;
    private String phone;
    private String purpose;
}
