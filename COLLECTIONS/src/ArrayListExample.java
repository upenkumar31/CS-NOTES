import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    ArrayList<Integer> arrayList;

    void Example() {
        arrayList = new ArrayList<>();

        //Adding Element
        arrayList.add(12);
        arrayList.add(1, 4); // index,value
        arrayList.addAll(new LinkedList<>()); // adding element from other collection
        arrayList.addAll(5, new LinkedList<>()); // adding from certain index
        arrayList.set(2, 12);

        //Deleting Element
        arrayList.remove(new Integer(12)); // Deleting Object
        arrayList.remove(1);
        arrayList.removeAll(new LinkedList<>()); // remove all value present in linkedList
        arrayList.removeIf(a -> a > 12); // removing element if element is greater that 12 (used Lambda)
        arrayList.clear();

        //Cloning
        ArrayList<Integer> cloneArrayList = (ArrayList<Integer>) arrayList.clone();

        //Searching
        arrayList.indexOf(new Integer(2));
        arrayList.contains(new Integer(12));

        //Iterating
        arrayList.forEach(a -> System.out.print(a));
        for (int i = 0; i < arrayList.size(); i++) {
        }

        //Capacity Increasing
        arrayList.ensureCapacity(20);

        //get element at index
        arrayList.get(2);

        //checking if empty or not
        arrayList.isEmpty();

        //Size Trimming
        arrayList.trimToSize();

        //getting sublist
        arrayList.subList(2,7);
    }
}
