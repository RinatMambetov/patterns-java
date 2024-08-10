package org.creational.factory;

public class Application {
    Button button;
    Checkbox checkBox;

    Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
