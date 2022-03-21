package com.muwaffaq.innopolis.solid.SRP.correct;

public class Price {
    double totals;
    String token;

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
}
