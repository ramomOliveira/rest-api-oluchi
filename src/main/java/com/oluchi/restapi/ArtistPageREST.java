package com.oluchi.restapi;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.oluchi.restapi.database.RepositoryArtistPage;
import com.oluchi.restapi.entity.ArtistPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/artist")

public class ArtistPageREST {

    @Autowired
    private RepositoryArtistPage repository;

    @GetMapping
    public List<ArtistPage> list() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<ArtistPage> findById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping
    public void saveArtist(@RequestBody ArtistPage artist) {
        repository.save(artist);
    }

    @PutMapping("{id}")
    public void changeArtist(@RequestBody ArtistPage artist, @PathVariable String id) {
        artist.setId(id);
        repository.save(artist);
    }

    @DeleteMapping("{id}")
    public void deleteArtist(@PathVariable String id) {
        repository.deleteById(id);
    }
}
