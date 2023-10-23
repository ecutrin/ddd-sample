package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<LineItem> lineItems = new ArrayList<>();

    public void add(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + lineItems +
                '}';
    }
}