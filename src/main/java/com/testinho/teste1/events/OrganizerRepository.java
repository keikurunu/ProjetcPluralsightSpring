package com.testinho.teste1.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
            new Organizer(101,"Globomantics", "Globomantics Technology Corporation"),
            new Organizer(102, "Caverd Rock", "Carved Rock Sports Equipment")
    );

    public List<Organizer> findAll(){
        return organizers;
    }

}
