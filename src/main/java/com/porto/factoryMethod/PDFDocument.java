package com.porto.factoryMethod;

public class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abrindo PDF.");
    }

    @Override
    public void save() {
        System.out.println("Salvando PDF.");
    }

    @Override
    public void close() {
        System.out.println("Fechando PDF.");
    }
}
