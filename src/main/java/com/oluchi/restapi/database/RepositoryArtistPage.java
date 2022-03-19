package com.oluchi.restapi.database;

import java.util.Optional;

import com.oluchi.restapi.entity.ArtistPage;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryArtistPage extends MongoRepository<ArtistPage, String> {

}
