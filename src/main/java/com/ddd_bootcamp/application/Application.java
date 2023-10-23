package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product1 = new Product("Apple Pencil");
        Item itemApplePencil = new Item(product1, 2);
        cart.add(itemApplePencil);
        Product product2 = new Product("Sony Wireless headphone");
        Item itemSonyHeadphone = new Item(product2, 1);
        cart.add(itemSonyHeadphone);

        cart.remove(itemApplePencil);

        System.out.println("Cart = " + cart);
        List<Item> items = cart.getLineItems();

        System.out.println("----------------------------------------");
        System.out.println("lineItems = " + items);
        System.out.println("----------------------------------------");

    }
}
