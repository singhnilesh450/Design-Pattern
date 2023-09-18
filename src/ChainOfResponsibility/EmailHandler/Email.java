package ChainOfResponsibility.EmailHandler;

class Email {
    private String content;
    private String type; // Type of the email (e.g., "Spam", "Fan", "Complaint", "NewLoc")

    public Email(String content, String type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }
}