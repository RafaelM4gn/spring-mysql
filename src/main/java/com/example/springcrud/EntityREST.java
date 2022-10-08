package com.example.springcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcrud.database.Repository;
import com.example.springcrud.entitys.EntityComponent;

@RestController
@RequestMapping("/entitys")
public class EntityREST {
    @Autowired
    private Repository repository;

    @PostMapping
    public void create(@RequestBody EntityComponent entity) {
        repository.save(entity);
    }

    @GetMapping
    public List<EntityComponent> read() {
        return repository.findAll();
    }

    @PutMapping
    public void update(@RequestBody EntityComponent entity) {
        if (entity.getId() > 0) {
            repository.save(entity);
        }
    }

    @DeleteMapping
    public void delete(@RequestBody EntityComponent entity){
        repository.delete(entity);
    }


}
