package structuralPattern.adapterPattern;

public class EmailServiceLegacy implements EmailService {
    @Override
    public void sendEmail(String to, String subject, String body) {
        // Simulate sending an email using the legacy system
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
