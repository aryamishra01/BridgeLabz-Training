package com.day2.medinventory;

import java.util.Objects;

public class Item<T> {
    String id;
    String name;
    int quantity;
    String expiry;
    T category;

    public Item(String id, String name, int quantity, String expiry, T category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiry = expiry;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Qty: " + quantity +
                " | Exp: " + expiry + " | " + category;
    }
}

