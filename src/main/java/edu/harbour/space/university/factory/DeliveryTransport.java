package edu.harbour.space.university.factory;

import java.util.UUID;

public abstract class DeliveryTransport {
    protected final UUID id;

    public DeliveryTransport(UUID id) {
        this.id = id;
    }

    public abstract void deliver(Order order);
}
