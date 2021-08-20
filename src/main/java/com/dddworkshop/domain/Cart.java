package com.dddworkshop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Cart {
    private final List<Item> items = new ArrayList<>();
    private final List<Item> deletedItems = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public void remove(Item item){
        items.remove(item);
        deletedItems.add(item);
    }

    public List<Item> getDeletedItems() {
        return deletedItems;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cart.class.getSimpleName() + "[", "]")
                .add("products=" + items)
                .toString();
    }
}
