package org.designpatterns.StructuralDesignPatterns.Decorator;

public class Main {
    public static void main(String args[])
    {
//        BasicCoffee basicCoffee=new BasicCoffee();
//        ChocolateCoffeeDecorator coffeeDecorator=new ChocolateCoffeeDecorator(basicCoffee);
//        System.out.println(coffeeDecorator.cost());
//        System.out.println(coffeeDecorator.description());

        // Order a basic coffee
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.description() + " costs $" + coffee.cost());

        // Add Milk to the coffee
        coffee = new ChocolateCoffeeDecorator(coffee);
        System.out.println(coffee.description() + " costs $" + coffee.cost());


    }
}
