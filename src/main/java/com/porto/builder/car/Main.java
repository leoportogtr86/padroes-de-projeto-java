package com.porto.builder.car;

public class Main {
    public static void main(String[] args) {
        CarroBuilder carroBuilder = new CarroBuilder();

        Carro carro = carroBuilder.setMotor("V8")
                .setCor("Preto")
                .setPortas(4)
                .setArCondicionado(true)
                .setSistemaDeSom(true)
                .build();

        System.out.println(carro);
    }
}
