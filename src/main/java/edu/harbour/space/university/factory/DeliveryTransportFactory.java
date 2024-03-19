package edu.harbour.space.university.factory;

import java.util.UUID;

public interface DeliveryTransportFactory {
    DeliveryTransport createTransport(UUID id);

    class ShipFactory implements DeliveryTransportFactory {

        @Override
        public DeliveryTransport createTransport(UUID id) {
            return new Ship(id);
        }
    }

    class TruckFactory implements DeliveryTransportFactory {

        @Override
        public DeliveryTransport createTransport(UUID id) {
            return new Truck(id);
        }
    }
}
