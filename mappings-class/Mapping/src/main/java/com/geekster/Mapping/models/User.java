package com.geekster.Mapping.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private Integer age;


    //@JsonBackReference
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_user-addressTable-addId", referencedColumnName = "addressId")
    //@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    //@ManyToMany(cascade = CascadeType.ALL ,mappedBy = "user")
    //private List<Address> userAddress;
    Address userAddress;

}
