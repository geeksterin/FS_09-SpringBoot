package com.geekster.Mapping.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "addressId")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String city;
    private String houseNumber;


    //@ManyToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "")
    //@ManyToOne(cascade = CascadeType.ALL)
    //private List<User> user;

    //@JsonIgnore
    //@JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    //@OneToMany(cascade = CascadeType.ALL)
    private User user;

}
