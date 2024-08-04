package com.porto.builder.car;

public class CarroDirector {
    private final CarroBuilder builder;

    public CarroDirector(CarroBuilder builder) {
        this.builder = builder;
    }

    public Carro construirCarroEsportivo() {
        return builder
                .setMotor("V8")
                .setPortas(2)
                .setCor("Vermelho")
                .setArCondicionado(true)
                .setSistemaDeSom(true)
                .build();
    }

    public Carro construirCarroFamiliar() {
        return builder
                .setMotor("V6")
                .setPortas(4)
                .setCor("Azul")
                .setArCondicionado(true)
                .setSistemaDeSom(false)
                .build();
    }
}
