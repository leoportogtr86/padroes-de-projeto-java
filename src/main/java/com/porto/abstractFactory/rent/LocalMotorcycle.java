package com.porto.abstractFactory.rent;

public class LocalMotorcycle implements Motorcycle{
    @Override
    public void ride() {
        System.out.println("Pilotando uma moto local");
    }
}
