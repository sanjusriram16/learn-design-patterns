package structuralPattern.adapterPattern;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
