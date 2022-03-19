package com.oluchi.restapi.database;

import java.util.List;

import com.oluchi.restapi.entity.Event;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEvent extends MongoRepository<Event, String> {

    List<Event> findAllByUserId(String userId);

}
