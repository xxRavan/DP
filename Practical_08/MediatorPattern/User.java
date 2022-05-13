public abstract class User
{
    public WhatsAppMediator mediator;
    String name;

    public User(WhatsAppMediator mediator, String name)
    {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String msg, User user);
    public abstract void receiveMessage(String msg);




}
