public class WildTurkey implements Turkey
{
    public void gobble()
    {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey flies");
    }
}

