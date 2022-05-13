public abstract class Beverage
{

 final void prepareBeverage()
 {
   boilWater();
   pourMilk();
   addSugar();
   addTeaorcoffee();
   addToppings();
   boil();
   pourInCup();
 }

 void boilWater()
 {
  System.out.println("Boiling The Water");
 }
 void pourMilk()
 {
  System.out.println("Pouring The Milk");
 }
 void addSugar()
 {
  System.out.println("Adding The Sugar");
 } 
 abstract void addTeaorcoffee();
 abstract void addToppings();

 void boil()
 {
  System.out.println("Again Boiling The Water");
 }
 void pourInCup()
 {
  System.out.println("Pouring In a Cup\n");
 }
}
