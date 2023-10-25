package com.ddd_bootcamp.domain;

import java.util.Currency;

public class Price {
    private Currency currency = Currency.getInstance("USD");
    private float value;

    public Price(float value) {
        this.value = value;
    }
}
