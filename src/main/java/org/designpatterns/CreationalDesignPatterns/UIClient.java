package org.designpatterns.CreationalDesignPatterns;

interface CheckBox {
    void implementCheckBox();
}

interface Button {
    void implementButton();
}

class Windows implements CheckBox, Button {

    @Override
    public void implementButton() {
        System.out.println("Windows button is implemented");
    }

    @Override
    public void implementCheckBox() {
        System.out.println("Windows checkbox is implemented");
    }
}

class MacBook implements CheckBox, Button {

    @Override
    public void implementButton() {
        System.out.println("Mac book Button is implemented");
    }

    @Override
    public void implementCheckBox() {
        System.out.println("Mac book CheckBox is implemented");
    }
}

interface Gui {
    Button createButton();

    CheckBox createCheckbox();
}

class WindowsFactory implements Gui {


    @Override
    public Button createButton() {
        return new Windows();
    }

    @Override
    public CheckBox createCheckbox() {
        return new Windows();
    }
}

class MacFactory implements Gui {
    @Override
    public Button createButton() {
        return new MacBook();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacBook();
    }
}

public class UIClient {
    private Button button;
    private CheckBox checkBox;

   UIClient(Gui factory) {
        this.button =factory.createButton();
        this.checkBox = factory.createCheckbox();
    }

    private void create()
    {
        button.implementButton();
        checkBox.implementCheckBox();
    }

    public static void main(String[] args) {
        Gui macFactory=new MacFactory();
        UIClient uiclient=new UIClient(macFactory);
        uiclient.create();
    }
}

