package com.porto.factoryMethod.transport;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega feita via carro.");
    }
}
