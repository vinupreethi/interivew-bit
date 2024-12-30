package org.designpatterns.CreationalDesignPatterns;

//Client code just call the factory method Interface and doesnt
//know have any idea about object creation
interface Product {
    void create();
}

class MonkeyToy implements Product {
    public void create() {
        System.out.println("Monkey is created");
    }
}

class DonkeyToy implements Product {
    public void create() {
        System.out.println("Donkey is created");
    }
}

abstract class ProductFactory {
    abstract Product createNewProduct();
}

 class MonkeyFactory extends ProductFactory {

    @Override
    public Product createNewProduct() {
        return new MonkeyToy();
    }
}

class DonkeyFactory extends ProductFactory {

    @Override
    public Product createNewProduct() {
        return new DonkeyToy();
    }
}

public class Factory
{
    public static void main(String args[]) {
        ProductFactory monkeyFactory = new MonkeyFactory();
        Product product = monkeyFactory.createNewProduct();
        product.create();
    }

}
