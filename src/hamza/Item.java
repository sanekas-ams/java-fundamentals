package Mall;

import java.util.UUID;

public class Item {

    private final int id;

    private final String name;

    private final double price;

    Item(int id, String name, Double price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return name;
    }
}
