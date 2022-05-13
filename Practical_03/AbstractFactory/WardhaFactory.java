class WardhaFactory implements PizzaIngredient
{
  public Sauce createsauce()
  {
     return new TomatoSauce();
  } 
  public Dough createdough()
  {
     return new ThinDough();
  } 
  public Cheese createcheese()
  {
     return new SoftCheese();
  }  

}
