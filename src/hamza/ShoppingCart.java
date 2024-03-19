
package Mall;

import java.util.ArrayList;

public class ShoppingCart {

    private final int id;
    ArrayList<Item> items = new ArrayList<>();

    ShoppingCart(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Double getTotal() {
        double total = 0;
        for(Item item: items) {
            total += item.getPrice();
        }
        return total;
    }

    public void show() {
        for(Item item: items) {
            System.out.println(item);
        }
    }

    //public double getTotal()
}
