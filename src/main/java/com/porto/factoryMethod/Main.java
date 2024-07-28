package com.porto.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PDFDocumentCreator();

        pdfCreator.openDocument();
        pdfCreator.saveDocument();
        pdfCreator.closeDocument();
    }
}
