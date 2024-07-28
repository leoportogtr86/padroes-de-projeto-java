package com.porto.factoryMethod.transport;

public class Bicycle implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega feita via bicicleta.");
    }
}
