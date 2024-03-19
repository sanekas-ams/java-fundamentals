package edu.harbour.space.university.factory;

import java.util.UUID;

public class Ship extends DeliveryTransport {

    public Ship(UUID id) {
        super(id);
    }

    @Override
    public void deliver(Order order) {

    }
}
