class Demo
 {
	public static void main(String args[])
	 {
		Turkey wt = new WildTurkey();
		Duck d = new TurkeyAdapter(wt);
		testduck(d);
	 }

	static void testduck(Duck d)
	 {
		d.quack();
		d.fly();
	 }
 }
