package com.porto.abstractFactory.ui;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Renderizando botão no windows");
    }
}
