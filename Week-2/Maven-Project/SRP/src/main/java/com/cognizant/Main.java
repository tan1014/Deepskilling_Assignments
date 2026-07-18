package com.cognizant;


public class Main {

    public static void main(String[] args) {

        Report report = new Report();

        report.fetchData();
        report.calculateTotals();
        report.renderHTML();
        report.emailToBoss();
    }
}