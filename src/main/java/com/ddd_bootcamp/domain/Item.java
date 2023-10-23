package com.ddd_bootcamp.domain;

public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Item(Product product) {
        this.product = product;
        this.quantity = 1;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Item))
            return false;
        if (obj == this)
            return true;
        return this.getProduct().equals(((Item) obj).getProduct());
    }
    @Override
    public int hashCode() {
        return this.getProduct().hashCode();
    }
}
