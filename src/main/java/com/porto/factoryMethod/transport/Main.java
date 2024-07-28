package com.porto.factoryMethod.transport;

public class Main {
    public static void main(String[] args) {
        TransportCreator creator = new BicycleCreator();

        creator.planDelivery();
    }
}
