package AbstractFactory.Windows_classes;



import AbstractFactory.Mac_OS_classes.MacButton;
import AbstractFactory.Mac_OS_classes.MacSelect;
import AbstractFactory.Mac_OS_classes.MacTextField;
import AbstractFactory.interfaces.Factory;
import AbstractFactory.interfaces.Select;

public class MacFactory implements Factory {
    public MacFactory() {
        System.out.println("Creating gui factory for macOS");
    }

    public MacButton createButton() {
        System.out.println("Creating Button for macOS");
        return new MacButton();
    }

    public MacTextField createTextField() {
        System.out.println("Creating TextField for macOS");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for macOS");
        return new MacSelect();
    }
}