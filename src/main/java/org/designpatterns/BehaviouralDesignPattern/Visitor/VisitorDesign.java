package org.designpatterns.BehaviouralDesignPattern.Visitor;

public class VisitorDesign {
    public static void main(String args[])
    {
        Visitor hotel=new HotelVisitor();
        GoldCreditCard goldCreditCard=new GoldCreditCard();
        goldCreditCard.accept(hotel);
    }
}
