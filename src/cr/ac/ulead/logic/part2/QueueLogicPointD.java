package cr.ac.ulead.logic.part2;

import cr.ac.ulead.interfaces.SerializerUlead;
import cr.ac.ulead.ui.Display;

public class QueueLogicPointD {

    private Display display = new Display();

    private SerializerUlead[] queue;
    private int head = 0;
    private int tail = 0;
    private int currentSize = 0;
    private int totalSize;

    public QueueLogicPointD(int size) {
        this.totalSize = size;
        queue = new SerializerUlead[totalSize];
    }

    public void enqueue(SerializerUlead serializerUlead) throws Exception {
        if (!isFull()) {
            queue[tail] = serializerUlead;
            display.printObjectAdded();
            this.tail = (tail+1) % totalSize;
            this.currentSize = currentSize+1;
        } else {
            throw new Exception();
        }
    }

    public SerializerUlead dequeue() throws Exception {
        if (!isEmpty()) {
            SerializerUlead object = queue[head];
            display.printObjectRemoved();
            this.head = (head+1) % totalSize;
            this.currentSize = currentSize-1;
            return object;
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
