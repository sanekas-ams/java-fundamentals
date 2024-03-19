package edu.harbour.space.university.factory;

import java.util.UUID;

import static java.lang.StringTemplate.STR;

public class Truck extends DeliveryTransport {
    public Truck(UUID id) {
        super(id);
    }

    @Override
    public void deliver(Order order) {
        System.out.println(STR."Truck delivers order: \{order.getId()}");
    }
}
