public class TurkeyAdapter implements Duck
{
    Turkey t;
    TurkeyAdapter(Turkey t)
    {
        this.t = t;
    }
    public void fly()
    {
        t.fly();
    }
    public void quack()
    {
        t.gobble();
    }
}
