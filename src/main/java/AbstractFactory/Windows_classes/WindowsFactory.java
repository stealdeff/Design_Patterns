package AbstractFactory.Windows_classes;


import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.Factory;
import AbstractFactory.interfaces.Select;
import AbstractFactory.interfaces.TextField;

public class WindowsFactory implements Factory {
    public WindowsFactory()
    {
        System.out.println("Creating gui factory for Windows OS");
    }

    public Button createButton() {
        System.out.println("Creating Button for Windows OS");
        return new WButton();
    }

    public TextField createTextField() {
        System.out.println("Creating TextField for Windows OS");
        return new WTextField();
    }

    public Select createSelect() {
        System.out.println("Creating Select for Windows OS");
        return new WSelect();
    }
}