package com.testinho.teste1.events;

import java.time.LocalDate;

public record Event(
        int id,
        String name,
        Organizer organizer,
        Vanue vanue,
        LocalDate startDate,
        LocalDate andDate){
}
