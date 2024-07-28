package com.porto.factoryMethod.document;

public class PDFDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
