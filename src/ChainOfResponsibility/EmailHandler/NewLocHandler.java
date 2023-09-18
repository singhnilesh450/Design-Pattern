package ChainOfResponsibility.EmailHandler;

class NewLocHandler implements EmailHandler {
    private EmailHandler nextHandler;

    @Override
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleEmail(Email email) {
        if (email.getType().equalsIgnoreCase("NewLoc")) {
            System.out.println("NewLocHandler: Handling new location email: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}