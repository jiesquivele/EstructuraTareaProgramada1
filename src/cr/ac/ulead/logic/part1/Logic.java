package cr.ac.ulead.logic.part1;

import cr.ac.ulead.interfaces.implementations.Pet;
import cr.ac.ulead.interfaces.implementations.Person;
import cr.ac.ulead.ui.Display;

import java.util.function.DoubleToIntFunction;

public class Logic {

    private Display display = new Display();
    private Person newPerson = new Person();
    private Pet newPet = new Pet();

    public void execute(int menuSelection) {
        String format;
        switch (menuSelection) {
            case 1:
                newPerson.setName(display.readName());
                newPerson.setLastName(display.readLastName());
                newPerson.setDateOfBirth(display.readDateOfBirth());
                newPerson.setWeight(display.readWeight());
                newPerson.setHeight(display.readHeight());
                display.printObjectCreated();
                format = chooseSerializationFormat(menuSelection);
                display.printDelimitator();
                display.printFormat(format);
                display.printDelimitator();
                break;
            case 2:
                newPet.setName(display.readName());
                newPet.setType(display.readType());
                newPet.setAge(display.readAge());
                display.printObjectCreated();
                format = chooseSerializationFormat(menuSelection);
                display.printDelimitator();
                display.printFormat(format);
                display.printDelimitator();
                break;
            case 3:
                display.printExitMessage();
                break;
            default:
                display.invalidSelection();
                break;
        }
    }

    private String chooseSerializationFormat(int menuSelection) {
        String format = null;
        display.showSerializationMenu();
        int option = display.readValue();
        if (menuSelection == 1 && option == 1) {
            format = newPerson.serializeXML();
        }
        if (menuSelection == 1 && option == 2) {
            format = newPerson.serializeJson();
        }
        if (menuSelection == 2 && option == 1) {
            format = newPet.serializeXML();
        }
        if (menuSelection == 2 && option == 2) {
            format = newPet.serializeJson();
        }
        return format;
    }
}
