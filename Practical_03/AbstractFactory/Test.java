class Test
{
  public static void main(String args[])
 {
   PizzaStore ps1,ps2;
   ps1 = new NagpurPizzaStore();
   ps1.orderpizza("Cheese");
   System.out.println("");
   
   ps2 = new WardhaPizzaStore();
   ps2.orderpizza("Corn");
  }
}
