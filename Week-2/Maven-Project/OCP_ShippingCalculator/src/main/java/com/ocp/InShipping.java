package com.ocp;

public class InShipping implements ShippingStrategy {

    @Override
    public double calculateShipping() {
        return 50;
    }
}