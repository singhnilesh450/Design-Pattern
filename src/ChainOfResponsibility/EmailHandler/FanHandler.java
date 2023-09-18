package ChainOfResponsibility.EmailHandler;

class FanHandler implements EmailHandler {
    private EmailHandler nextHandler;

    @Override
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleEmail(Email email) {
        if (email.getType().equalsIgnoreCase("Fan")) {
            System.out.println("FanHandler: Handling fan email: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}