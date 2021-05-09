import java.util.PriorityQueue;

public class PriorityQueueExample {
    PriorityQueue<String> priorityQueue;
    void Example()
    {
        //Max Heap
        priorityQueue = new PriorityQueue<>((a,b)->a.length()-b.length());

        //Min Heap
        priorityQueue = new PriorityQueue<>((a,b)->b.length()-a.length());

        //adding
        priorityQueue.add("ABC");
        priorityQueue.offer("ABC");

        //removing
        priorityQueue.remove("ABC");

        //contains
        priorityQueue.remove();
    }
}
