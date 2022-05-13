abstract class Pizza
{
  Sauce s;
  Dough d;
  Cheese c;

  public void bake()
  {
    System.out.println("Pizza getting baked....");
  }
  
  public void cut()
  {
    System.out.println("Pizza cut into pieces...");
  }
  
  public void pack()
  {
    System.out.println("Pizza packed in box....\n");
  }
  abstract void prepare();
  
}
