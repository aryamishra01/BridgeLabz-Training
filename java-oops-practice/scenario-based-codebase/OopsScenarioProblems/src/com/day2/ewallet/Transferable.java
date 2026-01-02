package com.day2.ewallet;

public interface Transferable {
    void transferTo(User receiver, double amount);
}
