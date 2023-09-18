package ChainOfResponsibility.EmailHandler;

public class Client {
    public static void main(String[] args) {
        // Create email handlers and set up the chain of responsibility.
        EmailHandler spamHandler = new SpamHandler();
        EmailHandler fanHandler = new FanHandler();
        EmailHandler complaintHandler = new ComplaintHandler();
        EmailHandler newLocHandler = new NewLocHandler();

        spamHandler.setNextHandler(fanHandler);
        fanHandler.setNextHandler(complaintHandler);
        complaintHandler.setNextHandler(newLocHandler);

        // Simulate processing different types of emails.
        Email spamEmail = new Email("Buy cheap watches!", "Spam");
        Email fanEmail = new Email("I'm your biggest fan!", "Fan");
        Email complaintEmail = new Email("I have a complaint.", "Complaint");
        Email newLocEmail = new Email("New location announcement.", "NewLoc");

        spamHandler.handleEmail(spamEmail);
        spamHandler.handleEmail(fanEmail);
        spamHandler.handleEmail(complaintEmail);
        spamHandler.handleEmail(newLocEmail);
    }
}