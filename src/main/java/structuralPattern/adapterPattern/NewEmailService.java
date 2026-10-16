package structuralPattern.adapterPattern;

public class NewEmailService {
    public void sendMessage(String to, String subject, String body) {
        // Implementation for sending email using the new service
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
