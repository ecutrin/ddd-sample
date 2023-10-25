package com.ddd_bootcamp.domain.services;

import com.ddd_bootcamp.domain.Price;

import java.util.Map;

public class CalculateDiscountedPrice {

    private static final Map<String, Price> competitorPrices;
    static {
        competitorPrices = Map.of(
                "Sony Wireless headphone", new Price(150f),
                "Apple Pencil", new Price(200f));
    }

    public static Price forProduct(String productName) {
        return new Price(competitorPrices.get(productName).getValue() * 0.9f);
    }
}
