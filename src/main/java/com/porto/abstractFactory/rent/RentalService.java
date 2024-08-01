package com.porto.abstractFactory.rent;

public class RentalService {
    private final Car car;
    private final Motorcycle motorcycle;

    public RentalService(VehicleFactory factory) {
        this.car = factory.createCar();
        this.motorcycle = factory.createMotorcycle();
    }

    public void rentVehicles() {
        car.drive();
        motorcycle.ride();
    }
}
