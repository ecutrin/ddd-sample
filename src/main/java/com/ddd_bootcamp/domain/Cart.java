package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getLineItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + items +
                '}';
    }
}