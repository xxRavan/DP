public class Student extends User
{
    public Student(WhatsAppMediator mediator, String name)
    {
        super(mediator,name);
    }

    @Override
    public void sendMessage(String msg,User user) {
        System.out.println(this.name + " : Sending Message = " + msg);
        mediator.sendMessage(msg,user);
    }
    public void receiveMessage(String msg)
    {
        System.out.println(this.name  + " : Received Message : " + msg);
    }
}
