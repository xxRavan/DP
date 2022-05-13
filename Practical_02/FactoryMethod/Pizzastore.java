abstract class Pizzastore
 {
 	Pizza p;

	 void orderpizza(String name)
	 {
		p = createpizza(name);
		p.Ingri();
		p.Bake();
		p.Cut();
		p.Pack();
		
	 }

	abstract Pizza createpizza(String name);
 }
