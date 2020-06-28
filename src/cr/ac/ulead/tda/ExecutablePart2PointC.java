package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.implementations.Pet;
import cr.ac.ulead.logic.part2.QueueLogicPointC;
import cr.ac.ulead.ui.Display;

public class ExecutablePart2PointC {

    public static void main(String[] args) {

        Display display = new Display();
        QueueLogicPointC queue = new QueueLogicPointC(50);
        Pet newPet;

        int menuOption;
        do {
            display.showMenuPointC();
            menuOption = display.readValue();
            switch(menuOption) {
                case 1:
                    newPet = createPet();
                    try {
                        queue.enqueue(newPet);
                    } catch (Exception e) {
                        display.printFull();
                    }
                    break;
                case 2:
                    try {
                        newPet = queue.dequeue();
                        display.printFormat(newPet.serializeXML());
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
        }
        while (menuOption != 3);
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
