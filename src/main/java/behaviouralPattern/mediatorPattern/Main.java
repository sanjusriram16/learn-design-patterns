package behaviouralPattern.mediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        User user1 = new ChatUser("Alice", chatMediator);
        User user2 = new ChatUser("Bob", chatMediator);
        User user3 = new ChatUser("Carol", chatMediator);

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("Hello Guys!");
        user2.sendMessage("Hey Alice!");
        user3.sendMessage("Hi everyone!");
    }
}
