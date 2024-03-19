package edu.harbour.space.university.ddd;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        LaundryService laundryService = new LaundryService(new NewWashingMachine());
        laundryService.doLaundry(new Order(UUID.randomUUID()));
    }
}
