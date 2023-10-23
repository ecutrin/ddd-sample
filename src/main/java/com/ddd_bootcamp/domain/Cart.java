package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();
    private List<Product> removedProducts = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
        removedProducts.add(item.getProduct());
    }

    public List<Item> getLineItems() {
        return items;
    }

    public List<Product> getRemovedProducts() {
        return removedProducts;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + items +
                '}';
    }
}