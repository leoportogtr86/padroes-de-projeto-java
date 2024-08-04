package com.porto.builder.car;

public class Carro {
    private final String motor;
    private final int portas;
    private final String cor;
    private final boolean arCondicionado;
    private final boolean sistemaDeSom;

    public Carro(CarroBuilder carroBuilder) {
        this.motor = carroBuilder.motor;
        this.portas = carroBuilder.portas;
        this.cor = carroBuilder.cor;
        this.arCondicionado = carroBuilder.arCondicionado;
        this.sistemaDeSom = carroBuilder.sistemaDeSom;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", portas=" + portas +
                ", cor='" + cor + '\'' +
                ", arCondicionado=" + arCondicionado +
                ", sistemaDeSom=" + sistemaDeSom +
                '}';
    }
}
