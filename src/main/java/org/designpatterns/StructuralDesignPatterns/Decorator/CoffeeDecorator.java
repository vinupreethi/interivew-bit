package org.designpatterns.StructuralDesignPatterns.Decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee basicCoffee;

    CoffeeDecorator(Coffee basicCoffee) {
        this.basicCoffee = basicCoffee;
    }
    @Override
    public double cost() {
        return basicCoffee.cost();  // Delegate the cost calculation to the wrapped coffee
    }

    @Override
    public String description() {
        return basicCoffee.description();  // Delegate description to the wrapped coffee
    }
}
