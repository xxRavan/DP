class PizzaDemo
 {
	public static void main(String args[])
	 {
		System.out.println("\nWelcome To Pizza Hub.....");
		Pizzastore ps1;
		ps1 = new Ngppizzastore();
		System.out.println("***********************************************");
		ps1.orderpizza("Nagpurian Veggie Pizza");
		System.out.println("***********************************************");
		Pizzastore ps2;

		ps2 = new Mumbaipizzastore();

		ps2.orderpizza("Mumbai Corn Pizza");
		System.out.println("***********************************************");
	 }
 }

