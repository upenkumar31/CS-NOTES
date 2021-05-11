public class StaticPolyMorphism {
    static void solve(String abc,String xyz)
    {
        System.out.println(abc+" "+xyz);
    }
    static void solve(String xyz,int abc)
    {
        System.out.println(xyz+" "+abc);
    }
    static void solve(String abc)
    {
        System.out.println(abc);
    }
    static void solve(int abc)
    {
        System.out.println(abc);
    }
    public static void main(String[] args)
    {
        solve("abc","xyz");
        solve("abc",7);
        solve("abc");
        solve(6);
    }
}
