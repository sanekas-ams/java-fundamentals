package edu.harbour.space.university.ddd;

public class LaundryService {
    private WashingMachine washingMachine;

    public LaundryService(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Order doLaundry(Order order) {
        washingMachine.washClothes(order.getClothes());
        order.complete();
        return order;
    }
}
