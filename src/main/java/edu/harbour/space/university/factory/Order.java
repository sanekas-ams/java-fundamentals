package edu.harbour.space.university.factory;

import java.util.UUID;

public class Order {
    private final UUID id;

    public Order(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
