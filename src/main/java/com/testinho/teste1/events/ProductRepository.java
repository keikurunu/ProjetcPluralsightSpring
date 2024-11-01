package com.testinho.teste1.events;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = List.of(
      new Product(801,501,"Standard","Standard Conference Ticket", new BigDecimal("499.00")),
      new Product(802,502,"Premium","Premium Conference Ticket", new BigDecimal("649.00")),
      new Product(803,503,"Standard","Developer Day Ticket", new BigDecimal("195.00")),
      new Product(804,504,"Regular","Regular Entrance", new BigDecimal("35.00")),
      new Product(805,505,"VIP","VIP Bonus Entrance", new BigDecimal("65.00"))

    );

    public List<Product> findByEventId(int eventId){
        return products.stream().filter(product -> product.eventId() == eventId).toList();
    }
}
