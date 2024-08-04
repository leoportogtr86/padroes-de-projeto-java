package com.porto.builder.car;

public class Main2 {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroBuilder();
        CarroDirector director = new CarroDirector(builder);

        Carro carroEsportivo = director.construirCarroEsportivo();
        System.out.println(carroEsportivo);

        Carro carroFamiliar = director.construirCarroFamiliar();
        System.out.println(carroFamiliar);
    }
}
