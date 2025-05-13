package com.example.musicdb.entity;

import jakarta.persistence.*;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Genre() {
    }  // prázdný konstruktor

    public Genre(String name) {
        this.name = name;
    }

    // gettery a settery...
}
