package org.creational.factory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("WindowsButton paint");
    }
}
