class NagpurFactory implements PizzaIngredient
{
  public Sauce createsauce()
  {
     return new ChilliSauce();
  } 
  public Dough createdough()
  {
     return new ThickDough();
  } 
  public Cheese createcheese()
  {
     return new MozerellaCheese();
  }  

}
