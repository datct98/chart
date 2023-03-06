package com.example.testswagger.model;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String phone;
    private String password;
}
