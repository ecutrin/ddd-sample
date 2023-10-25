package com.ddd_bootcamp.domain.bank;

public class Address {
    private final String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String
    toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
