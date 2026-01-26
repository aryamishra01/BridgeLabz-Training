package com.day2.dealtracker;

import java.time.*;

public class Deal<T> {

    String code;
    LocalDate validTill;
    int discount;
    int minPurchase;
    T promoType;

    public Deal(String c, LocalDate d, int dis, int min, T type) {
        code = c;
        validTill = d;
        discount = dis;
        minPurchase = min;
        promoType = type;
    }

    @Override
    public String toString() {
        return code + " | " + discount + "% | valid till " + validTill +
                " | min ₹" + minPurchase + " | type=" + promoType;
    }
}

