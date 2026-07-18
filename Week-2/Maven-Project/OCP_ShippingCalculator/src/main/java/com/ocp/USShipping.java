package com.ocp;

public class USShipping implements ShippingStrategy{
    @Override
    public double calculateShipping() {
        return 100;
    }
}
