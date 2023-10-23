package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {
    private String cartId; //CartId
    private List<Item> items = new ArrayList<>();
    private List<Product> removedProducts = new ArrayList<>();

    public Cart() {
        this.cartId = "Random"; // Need to make it random
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cartId, cart.cartId) && Objects.equals(items, cart.items) && Objects.equals(removedProducts, cart.removedProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId, items, removedProducts);
    }
}