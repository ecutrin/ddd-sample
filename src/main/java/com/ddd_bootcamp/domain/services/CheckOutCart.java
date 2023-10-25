package com.ddd_bootcamp.domain.services;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Order;

public class CheckOutCart {
    public static Order createOrder(Cart cart) {
        Order order = new Order();
        cart.checkOut();
        for (Item item : cart.getItems()
        ) {
            order.addProduct(item.getProduct());
        }
        return new Order();
    }
}
