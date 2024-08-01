package com.porto.abstractFactory.rent;

public class InternationalVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new InternationalCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new InternationalMotorcycle();
    }
}
