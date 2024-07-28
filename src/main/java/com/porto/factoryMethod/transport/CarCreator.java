package com.porto.factoryMethod.transport;

public class CarCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
