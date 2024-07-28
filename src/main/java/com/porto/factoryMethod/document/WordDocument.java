package com.porto.factoryMethod.document;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abrindo word.");
    }

    @Override
    public void save() {
        System.out.println("Salvando word.");
    }

    @Override
    public void close() {
        System.out.println("Fechando word.");
    }
}
