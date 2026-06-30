package com.cognizant.factory.factories;

import com.cognizant.factory.documents.Document;
import com.cognizant.factory.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}