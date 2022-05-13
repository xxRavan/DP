abstract class Pizza
 {
	String name;
	String sauce;
	String dough;
	
	abstract public void receipe();

	public void Bake()
	 {
		System.out.println("Pizza getting Bake........!!!");
	 }

	public void Cut()
 	 {
		System.out.println("Pizza Cut into Pieces......!!!");
	 }

	public void Pack()
 	 {
		System.out.println("Pizza Packed in Box.......!!!");
	 }
	public void Ingri()
 	 {
		System.out.println("Name of Pizza  "+name);
		System.out.println("Sauce of Pizza  "+sauce);
		System.out.println("Dough of Pizza  "+dough);
	 }

}
