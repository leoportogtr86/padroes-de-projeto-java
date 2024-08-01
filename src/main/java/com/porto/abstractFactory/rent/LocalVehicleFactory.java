package com.porto.abstractFactory.rent;

public class LocalVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new LocalCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new LocalMotorcycle();
    }
}
