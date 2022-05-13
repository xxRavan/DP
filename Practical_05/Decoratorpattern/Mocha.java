class Mocha extends Toppings
{
 Coffee c;
 Mocha( Coffee c)
  {
    this.c = c;
  }
  String getDescription()
  {
     return(c.getDescription() + "WithMocha");
  }
  double cost()
  {
    double coffeecost = c.cost();
    return(coffeecost + 30 );
  }
}
