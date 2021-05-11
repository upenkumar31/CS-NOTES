public class RunTimePolyMorphism extends DummyClass {
    int val;
    RunTimePolyMorphism(int val)
    {
        this.val = val;
    }
    @Override
    public void solve(String abc,String xyz)
    {
        System.out.println("RuntimePoly:" + abc+" "+xyz+val);
    }
    public static void main(String args[])
    {
        DummyClass obj = new RunTimePolyMorphism(4); //upcasting RunTimePoly IA-S DummyClass
        obj.solve("abc","xyz");
    }
}
