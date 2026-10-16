package structuralPattern.adapterPattern;

public class EmailServiceAdapter implements EmailService {
    private final NewEmailService newEmailService;

    public EmailServiceAdapter(NewEmailService newEmailService) {
        this.newEmailService = newEmailService;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        // Adapt the method call to the new email service
        newEmailService.sendMessage(to, subject, body);
    }
}
