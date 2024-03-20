package edu.harbour.space.university.mall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Customer {
    private UUID uuid=UUID.randomUUID();
    Map<Item,Integer> chosenItems = new HashMap<>();
    ShoppingCart shoppingCart =new ShoppingCart(null,0);
    double balance;
    public UUID getUuid() {
        return uuid;
    }

    Customer(UUID uuid, double balance, ShoppingCart shoppingCart){
        this.uuid=uuid;
        this.balance=balance;
        this.shoppingCart=shoppingCart;
    }
    public Map<Item,Integer> getChosenItems() {
        return chosenItems;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public double getBalance() {
        return balance;
    }

    public void chooseAnItem(Item item, int number){
       this.chosenItems.put(item,chosenItems.get(item)+number);
    }
}
