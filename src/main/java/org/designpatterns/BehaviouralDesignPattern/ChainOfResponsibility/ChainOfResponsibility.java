package org.designpatterns.BehaviouralDesignPattern.ChainOfResponsibility;

public class ChainOfResponsibility {
    public static void main(String args[])
    {
        SupportLevelOne supportLevelOne=new SupportLevelOne();
        SupportLevelTwo supportLevelTwo=new SupportLevelTwo();
        SupportLevelThree supportLevelThree=new  SupportLevelThree();
        supportLevelOne.setNextHandler(supportLevelTwo);
        supportLevelTwo.setNextHandler(supportLevelThree);

        supportLevelOne.handleRequestNow(new Request("3rd Request",3));


    }
}
