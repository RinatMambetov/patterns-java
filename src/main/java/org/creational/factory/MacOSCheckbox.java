package org.creational.factory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOSCheckbox paint");
    }
}
