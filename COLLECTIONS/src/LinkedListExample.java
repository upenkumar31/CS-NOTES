import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    LinkedList<String> linkedList;
    void example()
    {
        linkedList = new LinkedList<>();

        //adding Element
        linkedList.add("will add at end");
        linkedList.add(2,"add at index");
        linkedList.addAll(new ArrayList<>()); // add from other collection
        linkedList.addFirst("adding element in first");
        linkedList.addLast("adding Element in last");
        linkedList.addAll(2,new ArrayList<>()); // add from certain index
        linkedList.offer("abc");
        linkedList.offerFirst("abc");
        linkedList.offerLast("abc");

        //remove element
        linkedList.remove("any object");
        linkedList.remove(2); // remove element present at index
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirstOccurrence("ABC");
        linkedList.removeLastOccurrence("xyz");
        linkedList.removeAll(new ArrayList<>());
        linkedList.removeIf(a->a.equals("abc"));

        //searching and get
        linkedList.get(1); // indexed
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.contains("abc");
        linkedList.indexOf("abc");
        linkedList.peek();
        linkedList.peekFirst();
        linkedList.peekLast();

        linkedList.clear();
        linkedList.clone();
        linkedList.sort((a,b)->a.length()-b.length());
    }
}
