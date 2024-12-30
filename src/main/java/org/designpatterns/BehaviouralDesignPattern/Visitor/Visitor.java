package org.designpatterns.BehaviouralDesignPattern.Visitor;

public interface Visitor {
    public void visit(BronzeCreditCard bronzeCreditCard);
    public void visit(GoldCreditCard goldCreditCard);
}
