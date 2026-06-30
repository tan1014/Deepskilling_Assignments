package com.cognizant.factory.factories;

import com.cognizant.factory.documents.Document;
import com.cognizant.factory.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}