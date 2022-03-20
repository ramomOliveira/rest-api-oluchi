package com.oluchi.restapi;

import java.util.List;
import java.util.Optional;

import com.oluchi.restapi.database.RepositoryEvent;
import com.oluchi.restapi.entity.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

    @GetMapping("/user")
    public List<Event> listByUserId(@RequestHeader String userId) {
        return repository.findAllByUserId(userId);
    }

    @GetMapping("{id}")
    public Optional<Event> findById(@PathVariable String id) {

        return repository.findById(id);
    }

    @PostMapping
    public void saveEvent(@RequestBody Event event, @RequestHeader String userId) {
        event.setUserId(userId);
        repository.save(event);
    }

    @PutMapping("{id}")
    public ResponseEntity changeEvent(@RequestBody Event event, @PathVariable String id, @RequestHeader String userId) {
        Optional<Event> e = repository.findById(id);
        if (!e.isPresent() || !e.get().getUserId().equals(userId)) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        event.setId(id);
        repository.save(event);
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteEvent(@PathVariable String id, @RequestHeader String userId) {
        Optional<Event> e = repository.findById(id);
        if (!e.isPresent() || !e.get().getUserId().equals(userId)) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        repository.deleteById(id);
        return null;
    }
}
