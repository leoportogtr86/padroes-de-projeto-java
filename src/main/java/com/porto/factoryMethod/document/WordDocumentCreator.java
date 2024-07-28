package com.porto.factoryMethod.document;

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
