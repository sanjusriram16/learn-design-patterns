package structuralPattern.adapterPattern;

public class Client {

    static void main() {

        EmailService legacyEmailService = new EmailServiceLegacy();
        legacyEmailService.sendEmail("to@example.com", "Subject", "Body");

        EmailService newEmailService = new EmailServiceAdapter(new NewEmailService());
        newEmailService.sendEmail("to@example.com", "Subject", "Body");

    }
}
