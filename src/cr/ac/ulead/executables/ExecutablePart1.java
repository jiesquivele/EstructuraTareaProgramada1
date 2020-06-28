package cr.ac.ulead.executables;

import cr.ac.ulead.logic.part1.Logic;
import cr.ac.ulead.ui.Display;

public class ExecutablePart1 {

    public static void main(String[] args) {

        Display display = new Display();
        Logic logic = new Logic();

        int menuSelection;
        do {
            display.showMainMenu();
            menuSelection = display.readValue();
            logic.execute(menuSelection);
        } while (menuSelection != 3);
    }
}
