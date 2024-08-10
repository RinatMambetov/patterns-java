package org.creational.factory;

/*
Абстрактная фабрика — это порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов.
 */

public class Main {
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
//        System.out.println(osName);
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            throw new RuntimeException("Unknown OS");
        }
        app = new Application(factory);
        app.paint();
    }
}
