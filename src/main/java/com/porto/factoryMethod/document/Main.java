package com.porto.factoryMethod.document;

public class Main {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PDFDocumentCreator();

        pdfCreator.openDocument();
        pdfCreator.saveDocument();
        pdfCreator.closeDocument();
    }
}
