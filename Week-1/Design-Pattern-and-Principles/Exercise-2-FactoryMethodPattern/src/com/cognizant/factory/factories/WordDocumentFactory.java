package com.cognizant.factory.factories;

import com.cognizant.factory.documents.Document;
import com.cognizant.factory.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}