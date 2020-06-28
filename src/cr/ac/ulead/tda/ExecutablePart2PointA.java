package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.implementations.Person;
import cr.ac.ulead.logic.part2.StackLogicPointA;
import cr.ac.ulead.ui.Display;

public class ExecutablePart2PointA {

    public static void main(String[] args) {

        Display display = new Display();
        StackLogicPointA stack = new StackLogicPointA(50);
        Person newPerson;

        int menuOption;
        do {
            display.showMenuPointA();
            menuOption = display.readValue();
            switch (menuOption) {
                case 1:
                    try {
                        newPerson = createPerson();
                        stack.push(newPerson);
                    } catch (Exception e) {
                        display.printFull();
                    }
                    break;
                case 2:
                    try {
                        newPerson = stack.pop();
                        display.printFormat(newPerson.serializeXML());
                        display.printDelimitator();
                    } catch (Exception e) {
                        display.printEmpty();
                    }
                    break;
                case 3:
                    display.printExitMessage();
                    break;
                default:
                    display.invalidSelection();
                    break;
            }
        } while (menuOption != 3);
    }

    private static Person createPerson() {
        Display display = new Display();
        Person newPerson = new Person();
        newPerson.setName(display.readName());
        newPerson.setLastName(display.readLastName());
        newPerson.setDateOfBirth(display.readDateOfBirth());
        newPerson.setWeight(display.readWeight());
        newPerson.setHeight(display.readHeight());
        return newPerson;
    }
}
