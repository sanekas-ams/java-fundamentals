package edu.harbour.space.university.factory;

import java.util.UUID;

public class TransportCompany {
    private final DeliveryTransportFactory deliveryTransportFactory;

    public TransportCompany(DeliveryTransportFactory deliveryTransportFactory) {
        this.deliveryTransportFactory = deliveryTransportFactory;
    }

    public DeliveryTransport allocateTransport(UUID id) {
        return deliveryTransportFactory.createTransport(id);
    }
}
