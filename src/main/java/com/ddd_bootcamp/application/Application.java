package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.LineItem;
import com.ddd_bootcamp.domain.Product;

import javax.sound.sampled.Line;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product1 = new Product("Apple Pencil");
        LineItem lineItemApplePencil = new LineItem(product1, 2);
        cart.add(lineItemApplePencil);
        Product product2 = new Product("Sony Wireless headphone");
        LineItem lineItemSonyHeadphone = new LineItem(product2, 1);
        cart.add(lineItemSonyHeadphone);

        System.out.println("Cart = " + cart);
        List<LineItem> lineItems = cart.getLineItems();

        System.out.println("----------------------------------------");
        System.out.println("lineItems = " + lineItems);
        System.out.println("----------------------------------------");

    }
}
