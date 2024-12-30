package org.designpatterns.BehaviouralDesignPattern.Visitor;

public class GoldCreditCard implements Payment{
    @Override
    public void payment() {
        System.out.println("Paid using gold credit card");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
