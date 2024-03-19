package edu.harbour.space.university.ddd;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID id;
    private OrderState orderState ;
    private List<Cloth> clothes = new ArrayList<>();

    public Order(UUID id) {
        this.id = id;
        this.orderState = OrderState.CREATED;
    }

    public void complete() {
        this.orderState = OrderState.DONE;
    }

    public List<Cloth> getClothes() {
        return clothes;
    }
}
