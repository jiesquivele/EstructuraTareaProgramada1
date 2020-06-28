package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.implementations.Person;
import cr.ac.ulead.logic.part2.StackLogicPointB;
import cr.ac.ulead.ui.Display;

public class ExecutablePart2PointB {

    public static void main(String[] args) {

        Display display = new Display();
        StackLogicPointB stack = new StackLogicPointB(50);
        Person newPerson;

        int menuOption;
        do {
            display.showMenuPointB();
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
                        display.printFormat(newPerson.serializeJson());
                        display.printDelimitator();
                    } catch (Exception e) {
                        display.printEmpty();
                    }
                    break;
                case 3:
                    stack.getLeastHeight();
                    break;
                case 4:
                    display.printExitMessage();
                    break;
                default:
                    display.invalidSelection();
                    break;
            }
        } while (menuOption != 4);
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
