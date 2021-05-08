import java.util.HashSet;

public class HashSetExample {
    HashSet<String> hashSet;
    void Example()
    {
        hashSet = new HashSet<>();

        //adding
        hashSet.add("abc");

        //finding
        hashSet.contains("abc");

        // remove
        hashSet.remove("abc");

        //
        hashSet.forEach(a->System.out.print(a));
    }
}
