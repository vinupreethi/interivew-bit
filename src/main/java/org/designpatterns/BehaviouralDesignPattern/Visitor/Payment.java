package org.designpatterns.BehaviouralDesignPattern.Visitor;

public interface Payment {
    void payment();
    void accept(Visitor visitor);
}
