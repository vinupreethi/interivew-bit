package org.designpatterns.BehaviouralDesignPattern.Observer;

public class Main {
    public static void main(String args[])
    {
        WeatherStation weatherStation=new WeatherStation();
        Observer current=new CurrentCondition(weatherStation);


    }
}
