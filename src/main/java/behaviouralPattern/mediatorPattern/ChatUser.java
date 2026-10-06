package behaviouralPattern.mediatorPattern;

public class ChatUser extends User {
    public ChatUser(String name, Mediator mediator) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, User sender) {
        System.out.println(this.name + " receives from " + sender.getName() + ": " + message);
    }

    public String getName() {
        return name;
    }
}
