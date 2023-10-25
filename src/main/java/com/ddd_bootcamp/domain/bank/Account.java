package com.ddd_bootcamp.domain.bank;

import java.util.UUID;

public class Account {
    private final UUID id = UUID.randomUUID();
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    public Account updateAddress(Address newAddress) {
        this.address = newAddress;
        return this;
    }
}
