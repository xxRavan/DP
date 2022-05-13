class CheesePizza extends Pizza
{
  PizzaIngredient ps;
  CheesePizza(PizzaIngredient ps)
  {
    this.ps = ps;
  }
  public void prepare()
  {
    System.out.println("Preparing cheese pizza...");
  }
}
