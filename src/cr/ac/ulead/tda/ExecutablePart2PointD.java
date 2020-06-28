package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.SerializerUlead;
import cr.ac.ulead.interfaces.implementations.Person;
import cr.ac.ulead.interfaces.implementations.Pet;
import cr.ac.ulead.logic.part2.QueueLogicPointD;
import cr.ac.ulead.ui.Display;

public class ExecutablePart2PointD {

    public static void main(String[] args) {

        Display display = new Display();
        QueueLogicPointD queue = new QueueLogicPointD(50);
        SerializerUlead newPerson;
        SerializerUlead newPet;

        int menuOption;
        do {
            display.showMenuPointD();
            menuOption = display.readValue();
            switch (menuOption) {
                case 1:
                    newPerson = createPerson();
                    try {
                        queue.enqueue(newPerson);
                    } catch (Exception e) {
                        display.printFull();
                    }
                    break;
                case 2:
                    newPet = createPet();
                    try {
                        queue.enqueue(newPet);
                    } catch (Exception e) {
                        display.printFull();
                    }
                    break;
                case 3:
                    try {
                        SerializerUlead object = queue.dequeue();
                        display.printFormat(object.serializeJson());
                        display.printDelimitator();
                    } catch (Exception e) {
                        display.printEmpty();
                    }
                    break;
                case 4:
                    display.printExitMessage();
                    break;
                default:
                    display.invalidSelection();
                    break;
            }
        }
        while (menuOption != 4);
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

    private static Pet createPet() {
        Display display = new Display();
        Pet newPet = new Pet();
        newPet.setName(display.readName());
        newPet.setType(display.readType());
        newPet.setAge(display.readAge());
        return newPet;
    }
}
