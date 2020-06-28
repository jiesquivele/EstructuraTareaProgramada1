package cr.ac.ulead.logic.part2;

import cr.ac.ulead.interfaces.implementations.Person;
import cr.ac.ulead.ui.Display;

public class StackLogicPointB {

    private Display display = new Display();
    private Person[] stack;
    private int top = 0;
    private Person[] auxStack;
    private int auxTop = 0;
    private int totalSize;

    public StackLogicPointB(int totalSize) {
        this.totalSize = totalSize;
        stack = new Person[totalSize];
        auxStack = new Person[totalSize];
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isAuxEmpty() {
        return this.auxTop == 0;
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
            if (isAuxEmpty()) {
                auxStack[auxTop] = newPerson;
                auxTop++;
            } else {
                if (newPerson.getHeight() <= auxStack[auxTop-1].getHeight()) {
                    auxStack[auxTop] = newPerson;
                    auxTop++;
                }
            }
        }
    }

    public Person pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            top = top-1;
            display.printObjectRemoved();
            if (stack[top].getHeight() == auxStack[auxTop-1].getHeight()) {
                auxTop = auxTop-1;
            }
            return stack[top];
        }
    }

    public void getLeastHeight() {
        if (isAuxEmpty()) {
            display.printEmpty();
        } else {
            display.printLeastHeight(auxStack[auxTop-1].getHeight());
        }
    }
}


