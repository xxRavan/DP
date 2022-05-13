public class Demo
{
    public static void main(String[] args) {
        WhatsAppMediator mediator = new WhatsApp();
        User user1 = new Student(mediator, "Ranu");
        User user2 = new Student(mediator, "Rupal");
        User user3 = new Student(mediator, "Sakshi");
        User user4 = new Student(mediator, "Rupal");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.sendMessage("Hello All ",user1);

        System.out.println();
        mediator.removeUser(user2);
        user1.sendMessage("This is new message . ",user1);
    }
}
