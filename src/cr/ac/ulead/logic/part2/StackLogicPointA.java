package cr.ac.ulead.logic.part2;

import cr.ac.ulead.interfaces.implementations.Person;
import cr.ac.ulead.ui.Display;

public class StackLogicPointA {

    private Display display = new Display();
    private Person[] stack;
    private int top = 0;
    int totalSize;

    public StackLogicPointA(int totalSize) {
        this.totalSize = totalSize;
        stack = new Person[totalSize];
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top > totalSize-1;
    }

    public void push(Person newPerson) throws Exception {
        if (isFull()) {
            throw new Exception();
        } else {
            stack[top] = newPerson;
            display.printObjectAdded();
            top++;
        }
    }

    public Person pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            top = top-1;
            display.printObjectRemoved();
            return stack[top];
        }
    }
}
