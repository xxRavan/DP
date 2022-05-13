class TurkeyAdapter implements Duck
 {
	Turkey t;
	TurkeyAdapter(Turkey t)
	{
		this.t = t;
	}
	public void fly()
	 {
		for(int i=0;i<5;i++)
		t.fly();
	 }

	 public void quack()
 	{
		t.gobble();
 	}
	
 }
