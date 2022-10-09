import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
     Optional<Integer> first = Optional.ofNullable(null);
     Optional<Integer> second = Optional.ofNullable(20);
     System.out.println(sum(first,second));

    }
    public static Integer sum(Optional<Integer> first,Optional<Integer> second)
    {
        System.out.println(first.isPresent());
        System.out.println(second.isPresent());

        Integer x = first.orElse(new Integer(10));
        Integer y = first.orElse(new Integer(12));

        return x+y;
    }
}
