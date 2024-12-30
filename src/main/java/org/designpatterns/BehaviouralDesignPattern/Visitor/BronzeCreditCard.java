package org.designpatterns.BehaviouralDesignPattern.Visitor;

public class BronzeCreditCard implements Payment{
    @Override
    public void payment() {
        System.out.println("Paid using bronze credit card");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


