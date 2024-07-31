package com.porto.abstractFactory.ui;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Renderizando botão no Mac");
    }
}
