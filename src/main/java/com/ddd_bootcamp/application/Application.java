package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.*;
import com.ddd_bootcamp.domain.bank.Account;
import com.ddd_bootcamp.domain.bank.Address;
import com.ddd_bootcamp.domain.bank.Customer;
import com.ddd_bootcamp.domain.services.CalculateDiscountedPrice;

import java.util.List;

public class Application {
    public static void main(String[] args) {
//        codeProblem1to5();
//
//        //Code Problem 6
//        Cart cart1 = new Cart();
//        Cart cart2 = new Cart();
//
//        Product headphone1 = new Product(
//                "Sony Wireless headphone",
//                CalculateDiscountedPrice.forProduct("Sony Wireless headphone")
//        );
//
//        Item headphoneItem1 = new Item(headphone1,1);
//
//        Product headphone2 = new Product("Sony Wireless headphone", new Price(10f));
//        Item headphoneItem2= new Item(headphone2,1);
//
//        cart1.add(headphoneItem1);
//        cart2.add(headphoneItem2);
//
//        System.out.println("----------------------------------------");
//        System.out.print("headphone 1");
//        System.out.println(headphone1);
//        System.out.println("----------------------------------------");
//        System.out.print("cart1.equals(cart2) :");
//        System.out.println(cart1.equals(cart2)? "true=Carts are same " : "false=Carts are different");
//        System.out.println("----------------------------------------");
//        System.out.print("cart1.hasSameIdentityAs(cart2) :");
//        System.out.println(cart1.hasSameIdentityAs(cart2)? "true=Carts are same"  : "false=Carts are different");
//        System.out.println("----------------------------------------");
        Address address = new Address("Barcelona");
        Account account = new Account(address);
        Customer customer = new Customer(address, List.of(account));

        System.out.println("----------------------------------------");
        System.out.println(customer);
        System.out.println(customer.getAccounts());
        System.out.println("----------------------------------------");

        customer.updateAddress(new Address("Mumbai"));

        System.out.println("----------------------------------------");
        System.out.println(customer);
        System.out.println(customer.getAccounts());
        System.out.println("----------------------------------------");

    }

    private static void codeProblem1to5() {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone", new Price(10f));
        Item headphoneItem = new Item(headphone,1);
        cart.add(headphoneItem);

        Product applePencil = new Product("Apple Pencil", new Price(10f));
        Item applePencilItem = new Item(applePencil, 2);
        cart.add(applePencilItem);


        System.out.println("Cart = " + cart);
        List<Item> items = cart.getItems();
        System.out.println("items = " + items);

        Product applePencil1 = new Product("Apple Pencil", new Price(10f));
        Item applePencilItem1 = new Item(applePencil1, 2);

        cart.remove(applePencilItem1);

        System.out.println("----------------------------------------");
        System.out.println("After Removing Apple Pencil with 2 quantity");
        System.out.println("Cart = " + cart);
        List<Item> items1 = cart.getItems();
        System.out.println("items = " + items1);

        System.out.println("----------------------------------------");
        System.out.println("Removed product names = " + cart.removedProductNames());
    }
}
