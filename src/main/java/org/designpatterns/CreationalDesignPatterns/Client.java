package org.designpatterns.CreationalDesignPatterns;

interface Prototype {
    Prototype clone();
}

class Clone implements Prototype {
    private String data;
    Clone(String data)
    {
        this.data=data;
    }
    @Override
    public Prototype clone() {
        return new Clone(data);
    }
}

public class Client {
    public static void main(String args[]) {
        Clone prototype=new Clone("vinu");
        Clone clone = (Clone) prototype.clone();
        System.out.println(clone);
    }

}
