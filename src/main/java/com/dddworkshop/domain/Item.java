package com.dddworkshop.domain;

import java.util.StringJoiner;

public class Item {

    private final Product product;
    private final int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("product=" + product)
                .add("quantity=" + quantity)
                .toString();
    }
}
