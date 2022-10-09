import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasics {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","bcd","upen","upendra");
        List<String> listAfterFilter= list.stream().filter(element->element.length()==3).collect(Collectors.toList());
        List<String> listWithRandomFilter = list.stream().filter(element->element.contains("upen")).collect(Collectors.toList());
        long start = System.nanoTime();
        String filter = list.stream().map(a->a.toUpperCase()).sorted().collect(Collectors.joining("+"));
        System.out.println(filter);
        long finish = System.nanoTime();
        System.out.println(finish-start);
    }
}
