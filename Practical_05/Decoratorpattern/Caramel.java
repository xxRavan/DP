class Caramel extends Toppings
{
 Coffee c;
 Caramel( Coffee c)
  {
    this.c = c;
  }
  public String getDescription()
  {
     return(c.getDescription() + "WithCaramel");
  }
  double cost()
  {
    double coffeecost = c.cost();
    return(coffeecost + 40 );
  }
}
