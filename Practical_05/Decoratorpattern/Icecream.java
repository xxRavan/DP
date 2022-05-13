class Icecream extends Toppings
{
 Coffee c;
 Icecream( Coffee c)
  {
    this.c = c;
  }
  String getDescription()
  {
     return(c.getDescription() + "WithIcecream");
  }
  double cost()
  {
    double coffeecost = c.cost();
    return(coffeecost + 50 );
  }
}
