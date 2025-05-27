package com.example.musicdb.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "artists")
    private List<Song> songs = new ArrayList<>();

    private String name;

    // Konstruktor bez parametrů
    public Artist() {}

    public Artist(String name) {
        this.name = name;
    }

    // GETTERY A SETTERY
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
