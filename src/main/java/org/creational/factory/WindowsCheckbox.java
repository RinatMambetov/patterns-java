package org.creational.factory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox paint");
    }
}
