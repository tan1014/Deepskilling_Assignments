package com.ocp;

public class UKShipping implements ShippingStrategy {

    @Override
    public double calculateShipping() {
        return 200;
    }
}