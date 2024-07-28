package com.porto.factoryMethod.transport;

public abstract class TransportCreator {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
