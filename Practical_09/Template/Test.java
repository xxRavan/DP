class Test
{
 public static void main(String args[])
  {

  	Tea t = new Tea();
 	 {
		System.out.println("******************************");
  		System.out.println("Preparing  Tea");
		System.out.println("******************************");
 	 }
  	t.prepareBeverage();
  	Coffee c = new Coffee();
  	{
		System.out.println("******************************");
  		System.out.println("Preparing  Coffee");
		System.out.println("******************************");
 	}
  	c.prepareBeverage();

  }
 }

