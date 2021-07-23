
public final class User {

    private final String fullName;
    private final String emailId;

    public User(String fullName, String emailId) {
        this.fullName = fullName;
        this.emailId = emailId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailId() {
        return emailId;
    }
}
