public class GumballMachineDemo {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(10);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
