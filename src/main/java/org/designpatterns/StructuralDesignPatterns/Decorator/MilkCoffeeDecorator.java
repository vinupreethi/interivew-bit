package org.designpatterns.StructuralDesignPatterns.Decorator;

public class MilkCoffeeDecorator extends ChocolateCoffeeDecorator {

    MilkCoffeeDecorator(Coffee basicCoffee) {
        super(basicCoffee);
    }

    @Override
    public double cost() {
        return basicCoffee.cost()+10;
    }

    @Override
    public String description() {
        return basicCoffee.description()+"with milk";
    }
}
