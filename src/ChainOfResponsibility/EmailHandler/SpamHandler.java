package ChainOfResponsibility.EmailHandler;

class SpamHandler implements EmailHandler {
    private EmailHandler nextHandler;

    @Override
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleEmail(Email email) {
        if (email.getType().equalsIgnoreCase("Spam")) {
            System.out.println("SpamHandler: Handling spam email: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}
