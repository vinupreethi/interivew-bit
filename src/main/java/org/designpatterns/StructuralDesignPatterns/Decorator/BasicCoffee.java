package org.designpatterns.StructuralDesignPatterns.Decorator;

public class BasicCoffee implements Coffee{
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Basic one";
    }
}
