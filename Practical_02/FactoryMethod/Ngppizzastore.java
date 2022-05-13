class Ngppizzastore extends Pizzastore
 {
	Pizza  createpizza(String name)
	 {
		Pizza p = null ;
		
		if(name.equalsIgnoreCase("Nagpurian Veggie Pizza"))
		 {
				p = new NgpVeggieepizza();
		 }
		else
			
				if(name.equalsIgnoreCase("Nagpurian Corn Pizza"))
		 		{
					p = new NgpCornpizza();
		 		}
				else
				if(name.equalsIgnoreCase("Nagpurian Cheese Pizza"))
		 		{
					p = new NgpCheesepizza();
		 		}
			

		return (p);
	 }
 }

