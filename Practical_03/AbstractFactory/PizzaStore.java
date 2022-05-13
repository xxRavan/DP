abstract class PizzaStore
{
   Pizza p;
   void orderpizza(String name)
   {
        p = createpizza(name);
        p.prepare();
        p.bake();
        p.cut();
        p.bake();
        
   }
   abstract Pizza createpizza(String name);
   
}
