import java.util.ArrayList;
import java.util.List;

public class WhatsApp implements WhatsAppMediator
{
    private final List<User> users;
    public WhatsApp(){
        this.users = new ArrayList<>();
    }
    public User user;

    @Override
    public void sendMessage(String message,User user)
    {
        for (User u : this.users)
        {
            if (u !=user)
            {
                u.receiveMessage(message);
            }
        }

    }

    public void addUser(User user) {
        users.add(user);
    }


    public void removeUser(User user) {
        users.remove(user);
    }

}
