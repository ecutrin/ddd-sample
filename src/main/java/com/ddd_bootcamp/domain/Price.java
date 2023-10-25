package com.ddd_bootcamp.domain;

import java.util.Currency;
import java.util.Objects;

public class Price {
    private Currency currency = Currency.getInstance("USD");
    private float value;

    public Price(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Float.compare(price.value, value) == 0 && Objects.equals(currency, price.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, value);
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency=" + currency +
                ", value=" + value +
                '}';
    }
}
