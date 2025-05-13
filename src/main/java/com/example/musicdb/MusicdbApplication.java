package com.example.musicdb;


import com.example.musicdb.entity.Album;
import com.example.musicdb.entity.Artist;
import com.example.musicdb.entity.Genre;
import com.example.musicdb.repository.AlbumRepository;
import com.example.musicdb.repository.ArtistRepository;
import com.example.musicdb.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MusicdbApplication {

	@Autowired
	private ArtistRepository artistRepository;

	@Autowired
	private AlbumRepository albumRepository;

	@Autowired
	private GenreRepository genreRepository;

	public static void main(String[] args) {
		SpringApplication.run(MusicdbApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader() {
		return args -> {
			// Vkládání žánrů
			genreRepository.save(new Genre("AOR"));
			genreRepository.save(new Genre("Hard Rock"));
			genreRepository.save(new Genre("Melodic Rock"));

			// Vkládání umělců
			Artist artist1 = artistRepository.save(new Artist("Journey"));
			Artist artist2 = artistRepository.save(new Artist("Foreigner"));
			Artist artist3 = artistRepository.save(new Artist("Survivor"));

			// Vložení alb
			Album album1 = new Album();
			album1.setTitle("Escape");
			album1.setReleaseYear(1981);
			album1.setArtist(artist1); // Použití již uloženého umělce Journey
			albumRepository.save(album1);

			Album album2 = new Album();
			album2.setTitle("Frontiers");
			album2.setReleaseYear(1983);
			album2.setArtist(artist1); // Použití již uloženého umělce Journey
			albumRepository.save(album2);

			Album album3 = new Album();
			album3.setTitle("4");
			album3.setReleaseYear(1981);
			album3.setArtist(artist2); // Použití již uloženého umělce Foreigner
			albumRepository.save(album3);
		};
	}
}




