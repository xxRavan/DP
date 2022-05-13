class DuckTest
 {
	public static void main(String args[])
	 {
		System.out.println("******************************************");
		
		Duck d = new RubberDuck();
		d.display();
		d.swim();
		d.performfly();
		d.performquack();

		System.out.println("******************************************");
		
		Duck wd = new WoddenDuck();
		wd.display();
		wd.swim();
		wd.performfly();
		wd.performquack();

		System.out.println("******************************************");
		
		Duck rd = new RedheadDuck();
		rd.display();
		rd.swim();
		rd.performfly();
		rd.performquack();

		System.out.println("******************************************");
		Duck md = new MallardDuck();
		md.display();
		md.swim();
		md.performfly();
		md.performquack();
		System.out.println("******************************************");

	 }
 }
