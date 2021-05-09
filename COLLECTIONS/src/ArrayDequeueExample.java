import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {
    Deque<String> arrayDeque = new ArrayDeque<String>();
    void Example()
    {
        // adding
        arrayDeque.add("ABC");
        arrayDeque.addFirst("ABC");
        arrayDeque.addLast("ABC");

        //removing
        arrayDeque.remove("ABC");
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        arrayDeque.removeFirstOccurrence("ABC");

        //find
        arrayDeque.contains("ABC");
        arrayDeque.getFirst();
        arrayDeque.getLast();
    }
}
