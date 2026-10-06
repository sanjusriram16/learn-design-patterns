package behaviouralPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (!user.getName().equals(sender.getName())) {
                user.receiveMessage(message, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
