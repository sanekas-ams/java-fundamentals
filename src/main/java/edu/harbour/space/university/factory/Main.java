package edu.harbour.space.university.factory;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        DeliveryTransportFactory shipFactory = new DeliveryTransportFactory.ShipFactory();
        DeliveryTransportFactory truckFactory = new DeliveryTransportFactory.TruckFactory();
        TransportCompany transportCompany = new TransportCompany(truckFactory);
        Order order = new Order(UUID.randomUUID());
        transportCompany.allocateTransport(UUID.randomUUID()).deliver(order);
    }
}
