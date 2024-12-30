package org.designpatterns.BehaviouralDesignPattern.Visitor;

public class HotelVisitor implements Visitor {

    @Override
    public void visit(BronzeCreditCard bronzeCreditCard) {
        System.out.println(bronzeCreditCard);
    }

    @Override
    public void visit(GoldCreditCard goldCreditCard) {
        System.out.println(goldCreditCard);
    }
}
