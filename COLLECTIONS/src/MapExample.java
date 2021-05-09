import java.util.HashMap;
import java.util.Map;

public class MapExample {
    Map<String,String> map = new HashMap<>();
    void Example()
    {
        //getting
        map.get("A");

        //putting
        map.put("A","A");

        //put if key is absent
        map.putIfAbsent("A","A");

        //get default if not present
        map.getOrDefault("A","A");

        //find key
        map.containsKey("A");

        //find value
        map.containsValue("A");

        //key array
        String[] keys = (String[]) map.keySet().toArray();

        //value array
        String[] values = (String[]) map.values().toArray();
    }
}
