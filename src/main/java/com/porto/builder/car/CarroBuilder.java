package com.porto.builder.car;

public class CarroBuilder {
    String motor;
    int portas;
    String cor;
    boolean arCondicionado;
    boolean sistemaDeSom;

    public CarroBuilder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public CarroBuilder setPortas(int portas) {
        this.portas = portas;
        return this;
    }

    public CarroBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
        return this;
    }

    public CarroBuilder setSistemaDeSom(boolean sistemaDeSom) {
        this.sistemaDeSom = sistemaDeSom;
        return this;
    }

    public Carro build(){
        return new Carro(this);
    }
}
