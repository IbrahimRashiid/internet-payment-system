package com.software.Phase2.Discount;

public abstract class Discount {
    double discountPercentage;

    public Discount() {
        discountPercentage=0.0;
    }

    public Discount(double discountPercentage) {

        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}
