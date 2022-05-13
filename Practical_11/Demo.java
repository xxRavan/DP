public class Demo
{
    public static void main(String[] args)
    {
        Turkey wt = new WildTurkey();
        Duck d = new TurkeyAdapter(wt);
        testduck(d);

        Duck d1 = new RedHeadDuck();
        Duck d2 = new MallardDuck();
        testduck(d1);
        testduck(d2);

    }
    public static void testduck(Duck d)
    {
        d.fly();
        d.quack();
    }
}
