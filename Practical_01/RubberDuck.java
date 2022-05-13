class RubberDuck extends Duck
 {
	RubberDuck()
	 {
		fb = new Nofly();
		qb = new Squeek();
	 }
	
	public void display()
	 {
		System.out.println("I am Rubber Duck");
	 }
 }  
