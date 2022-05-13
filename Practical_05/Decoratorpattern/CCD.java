class CCD
{
   public static void main(String args[])
   {
      Coffee espresso = new Espresso();
      Toppings caramel = new Caramel(espresso);
      System.out.println("Your order is " + caramel.getDescription()); 
      System.out.println("Total cost = " + caramel.cost());
   }
}
