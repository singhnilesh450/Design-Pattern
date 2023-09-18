package ChainOfResponsibility.EmailHandler;

class ComplaintHandler implements EmailHandler {
    private EmailHandler nextHandler;

    @Override
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleEmail(Email email) {
        if (email.getType().equalsIgnoreCase("Complaint")) {
            System.out.println("ComplaintHandler: Handling complaint email: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}