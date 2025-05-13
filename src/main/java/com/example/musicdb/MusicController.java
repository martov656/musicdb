package com.example.musicdb;

import com.example.musicdb.entity.Album;
import com.example.musicdb.entity.Artist;
import com.example.musicdb.repository.AlbumRepository;
import com.example.musicdb.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private AlbumRepository albumRepository;

    // Endpoint pro zobrazení seznamu alb
    @GetMapping("/albums")
    public String getAllAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();  // Získání všech alb
        model.addAttribute("albums", albums);  // Předání dat do šablony
        return "albums";  // Název šablony (HTML souboru)
    }

    // Endpoint pro zobrazení seznamu umělců
    @GetMapping("/artists")
    public String getAllArtists(Model model) {
        List<Artist> artists = artistRepository.findAll();  // Získání všech umělců
        model.addAttribute("artists", artists);  // Předání dat do šablony
        return "artists";  // Název šablony (HTML souboru)
    }
}
