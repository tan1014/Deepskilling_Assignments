package com.ocp;

public class ShippingCalculator {

    public double calculate(ShippingStrategy strategy) {
        return strategy.calculateShipping();
    }
}