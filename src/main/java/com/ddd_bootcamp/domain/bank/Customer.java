package com.ddd_bootcamp.domain.bank;

import java.util.List;
import java.util.UUID;

public class Customer {

    private final UUID id = UUID.randomUUID();
    private Address address;
    private List<Account> accounts;

    public Customer(Address address, List<Account> accounts) {
        this.address = address;
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                ", accounts=" + accounts +
                '}';
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        this.accounts = this.accounts.stream().map(account -> account.updateAddress(newAddress)).toList();
    }
}
