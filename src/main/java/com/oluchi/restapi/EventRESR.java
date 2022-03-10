package com.oluchi.restapi;

import java.util.List;
import java.util.Optional;

import com.oluchi.restapi.database.RepositoryEvent;
import com.oluchi.restapi.entity.Event;

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
@RequestMapping("/event")
public class EventRESR {

    @Autowired
    private RepositoryEvent repository;

    @GetMapping
    public List<Event> list() {
        return repository.findAll();
    }

    @GetMapping(value = "event/{id}")
    public Optional<Event> findById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping
    public void saveEvent(@RequestBody Event event) {
        repository.save(event);
    }

    @PutMapping
    public void changeEvent(@RequestBody Event event) {

        repository.save(event);
    }

    @DeleteMapping
    public void deleteEvent(@RequestBody Event event) {
        repository.delete(event);
    }
}
