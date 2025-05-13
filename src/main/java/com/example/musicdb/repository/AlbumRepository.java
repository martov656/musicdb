package com.example.musicdb.repository;

import com.example.musicdb.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    // Přidání metod pro práci s alby, např. podle názvu, roku vydání atd.
}
