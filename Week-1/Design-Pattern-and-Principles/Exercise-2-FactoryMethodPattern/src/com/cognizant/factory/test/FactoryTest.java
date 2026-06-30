package com.cognizant.factory.test;

import com.cognizant.factory.documents.Document;
import com.cognizant.factory.factories.ExcelDocumentFactory;
import com.cognizant.factory.factories.PdfDocumentFactory;
import com.cognizant.factory.factories.WordDocumentFactory;

public class FactoryTest {

    public static void main(String[] args) {

        WordDocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();

        PdfDocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        ExcelDocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}