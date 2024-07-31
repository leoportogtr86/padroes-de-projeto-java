package com.porto.abstractFactory.ui;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Renderizando checkbox no Windows");
    }
}
