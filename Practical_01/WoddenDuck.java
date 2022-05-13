class WoddenDuck extends Duck
 {
	WoddenDuck()
	 {
		fb = new Nofly();
		qb = new Noquack();
	 }
	
	public void display()
	 {
		System.out.println("I am Wodden Duck");
	 }
 }  
