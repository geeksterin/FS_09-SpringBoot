package com.geekster.Mapping.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String city;
    private String houseNumber;

    //@OneToOne(cascade = CascadeType.ALL)
    //@ManyToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "")
    //@ManyToOne(cascade = CascadeType.ALL)
    private List<User> user;

}
