package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");
        Item item = new Item(product, 3);
        cart.add(item);

        List<Item> actual = cart.getLineItems();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
        assertEquals(3, actual.get(0).getQuantity());
    }
}