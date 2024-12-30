package org.designpatterns.BehaviouralDesignPattern.Template;

/*
The template method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
but allows subclasses to change specific steps without changing the algorithm's structure.
Put differently, it acts as an algorithm's template,
letting subclasses take over specific steps while maintaining its general structure.
 */
public class Template {
    public static void main(String args[])
    {
        Game game=new FootBall();
        game.play();
    }
}
