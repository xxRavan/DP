class NagpurPizzaStore extends PizzaStore
{
   Pizza createpizza(String type)
   {
     Pizza p = null;
     PizzaIngredient ps = new NagpurFactory();
     if(type.equalsIgnoreCase("Cheese"))
     {
       p = new CheesePizza(ps);
     }
     else
     {
       p = new CornPizza(ps);
     }
        return (p);
   }
}
