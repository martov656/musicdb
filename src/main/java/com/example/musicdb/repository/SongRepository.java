package com.example.musicdb.repository;

import com.example.musicdb.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    // Můžeš přidat např. vlastní dotazy – třeba podle alba nebo interpreta
    List<Song> findByAlbumId(Long albumId);
}
