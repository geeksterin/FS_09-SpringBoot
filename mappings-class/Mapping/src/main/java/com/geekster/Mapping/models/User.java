package com.geekster.Mapping.models;

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
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private Integer age;

    //@OneToOne(mappedBy = "user")
    // @JoinColumn(name = "fk_user-addressTable-addId", referencedColumnName = "addressId")
    //@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    //@ManyToMany(cascade = CascadeType.ALL ,mappedBy = "user")
    private List<Address> userAddress;

}
