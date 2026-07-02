package com.cognizant.factory.documents;

public class WordDocument implements com.cognizant.factory.documents.Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}