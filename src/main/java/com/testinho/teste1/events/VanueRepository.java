package com.testinho.teste1.events;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VanueRepository {

    public final List<Vanue> vanues = List.of(
      new Vanue(201, "Globomatic Main Oficce", "Test Street 325", "New York", "USA"),
      new Vanue(202,"Sea View Hotel", "Beach Boulevard 863", "Los Angeles", "USA")
    );

    public Optional<Vanue> findById( int id){
        return vanues.stream().filter(vanue -> vanue.id() == id).findAny();
    }
}
