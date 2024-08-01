package com.porto.abstractFactory.rent;

public class LocalCar implements Car {
    @Override
    public void drive() {
        System.out.println("Dirigindo um carro local");
    }
}
