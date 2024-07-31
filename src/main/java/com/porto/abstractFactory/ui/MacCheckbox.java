package com.porto.abstractFactory.ui;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Renderizando checkbox no Mac");
    }
}
