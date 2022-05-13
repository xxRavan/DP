class CornPizza extends Pizza
{
  PizzaIngredient ps;
  CornPizza(PizzaIngredient ps)
  {
    this.ps = ps;
  }
  public void prepare()
  {
    System.out.println("Preparing Corn Pizza...");
  }
}
