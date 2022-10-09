import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
     Optional<Integer> first = Optional.ofNullable(10);
     Optional<Integer> second = Optional.ofNullable(20);
     System.out.println(sum(10,20));
     System.out.println(sum1(first,second));
    }
    public static Integer sum1(Optional<Integer> first,Optional<Integer> second)
    {
        System.out.println(first.isPresent());
        System.out.println(second.isPresent());

        Integer x = first.orElse(new Integer(10));
        Integer y = first.orElse(new Integer(12));

        return x+y;
    }
    static <T extends Integer> Integer sum(T a, T b)
    {
        return a.intValue()+b.intValue();
    }
}
