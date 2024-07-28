package com.porto.factoryMethod.transport;

public class BicycleCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
