package ChainOfResponsibility.EmailHandler;

interface EmailHandler {
    void setNextHandler(EmailHandler handler);
    void handleEmail(Email email);
}
