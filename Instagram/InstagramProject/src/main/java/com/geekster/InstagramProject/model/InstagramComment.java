package com.geekster.InstagramProject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InstagramComment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String commentBody;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_post_ID")
    private Post post;


}
