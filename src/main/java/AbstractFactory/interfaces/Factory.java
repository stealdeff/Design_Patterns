package AbstractFactory.interfaces;

public interface Factory {
    Select createSelect();

    TextField createTextField();

    Button createButton();
}
