package com.porto.abstractFactory.rent;

public class Main {
    private static RentalService configureRentalService() {
        RentalService rentalService;
        VehicleFactory factory;
        String supplierType = System.getProperty("supplier.type").toLowerCase();

        if (supplierType.equals("local")) {
            factory = new LocalVehicleFactory();
        } else {
            factory = new InternationalVehicleFactory();
        }

        rentalService = new RentalService(factory);
        return rentalService;
    }

    public static void main(String[] args) {
        // Defina a propriedade do sistema para simular a escolha do fornecedor
        System.setProperty("supplier.type", "local"); // ou "international"

        RentalService rentalService = configureRentalService();
        rentalService.rentVehicles();
    }
}
