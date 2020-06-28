package cr.ac.ulead.logic.part2;

import cr.ac.ulead.interfaces.implementations.Pet;
import cr.ac.ulead.ui.Display;

public class QueueLogicPointC {

    private Display display = new Display();

    Pet[] queue;
    int head = 0;
    int tail = 0;
    int currentSize = 0;
    int totalSize;

    public QueueLogicPointC(int size) {
        this.totalSize = size;
        queue = new Pet[totalSize];
    }

    public void enqueue(Pet pet) throws Exception {
        if (!isFull()) {
            queue[tail] = pet;
            display.printObjectAdded();
            this.tail = (tail+1) % totalSize;
            this.currentSize = currentSize+1;
        } else {
            throw new Exception();
        }
    }

    public Pet dequeue() throws Exception {
        if (!isEmpty()) {
            Pet dequeuedPet = queue[head];
            display.printObjectRemoved();
            this.head = (head+1) % totalSize;
            this.currentSize = currentSize-1;
            return dequeuedPet;
        } else {
            throw new Exception();
        }
    }

    public int getSize () {
        return this.currentSize;
    }

    public boolean isEmpty () {
        return getSize() == 0;
    }

    public boolean isFull () {
        return getSize() == totalSize;
    }
}
