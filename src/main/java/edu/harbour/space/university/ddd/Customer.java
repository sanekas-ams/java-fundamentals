package edu.harbour.space.university.ddd;

import java.util.UUID;

public class Customer {

    private final UUID id;
    private final CustomerInfo customerInfo;

    public Customer(UUID id, CustomerInfo customerInfo) {
        this.id = id;
        this.customerInfo = customerInfo;
    }
}
