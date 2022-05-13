abstract class Duck
 {
	FlyBehavior fb;
	QuackBehavior qb;
	
	public void swim()
	 {
		System.out.println("I can Swim");
	 }

	abstract public void display();

	 void performfly()
	  {
		fb.fly();
	  }
	void performquack()
	  {
		qb.quack();
	   }
}
