package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(5);
        myQueue.enqueue(2);

        myQueue.dequeue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();


    }
}
