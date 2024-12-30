package org.designpatterns.StructuralDesignPatterns.Decorator;

public class ChocolateCoffeeDecorator extends CoffeeDecorator{


    ChocolateCoffeeDecorator(Coffee basicCoffee) {
        super(basicCoffee);
    }

    @Override
    public double cost() {
        return basicCoffee.cost()+5;
    }

    @Override
    public String description() {
        return basicCoffee.description()+"with chocolate";
    }
}
