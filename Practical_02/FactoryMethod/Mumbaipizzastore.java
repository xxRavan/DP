class Mumbaipizzastore extends Pizzastore
 {
	Pizza createpizza(String name)
	 {
		Pizza p = null ;
		
		if(name.equalsIgnoreCase("Mumbai Veggie Pizza"))
		 {
				p = new MumbaiVeggieepizza();
		 }
		else
				if(name.equalsIgnoreCase("Mumbai Corn Pizza"))
		 		{
					p = new MumbaiCornpizza();
		 		}
				else
					if(name.equalsIgnoreCase("Mumbai Cheese Pizza"))
		 			{
						p = new MumbaiCheesepizza();
		 			}
			

			return (p);
	 }
 }

