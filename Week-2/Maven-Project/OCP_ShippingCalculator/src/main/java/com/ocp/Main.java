package com.ocp;

public class Main {

    public static void main(String[] args) {

        ShippingCalculator calculator = new ShippingCalculator();

        System.out.println("US Shipping : " +
                calculator.calculate(new USShipping()));

        System.out.println("UK Shipping : " +
                calculator.calculate(new UKShipping()));

        System.out.println("IN Shipping : " +
                calculator.calculate(new InShipping()));
    }
}