public interface WhatsAppMediator {

    public void sendMessage(String message, User user);
    public void addUser(User user);
    public void removeUser(User user);

}
