package edu.harbour.space.university.mall;

import java.util.*;

public class Store {
    private Set<Item> storeItems= new HashSet<>();
    private Map<String , Item> anyItem = new HashMap<>();

    boolean addStoreItems(Item item) {
        if (anyItem.get(item.name)==null){
            this.storeItems.add(item);
            anyItem.put(item.getName(),item);
            return true;
        }
        return false;
    }
    boolean increaseAnItem(Item item , int number) {
        if (anyItem.get(item.name)==null){
            return false;
        }
        item.increaseNumber(number);
        return true;
    }
    public Set<Item> getStoreItems() {
        return storeItems;
    }
    public Item isAnyInShoppe(String name){
        return anyItem.get(name);
    }

}
