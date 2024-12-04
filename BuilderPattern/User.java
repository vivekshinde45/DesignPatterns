package DesignPattern.BuilderPattern;

public class User {
    private final Integer userId;
    private final String firstName;
    private final String emailId;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.firstName = userBuilder.firstName;
        this.emailId = userBuilder.emailId;
    }

    @Override
    public String toString() {
        return "User with userID: "
                + this.userId
                + " and user name is: "
                + this.firstName
                + " with email ID: "
                + this.emailId;
    }

    // static builder class to build the object
    static class UserBuilder {
        private Integer userId;
        private String firstName;
        private String emailId;

        public UserBuilder() {

        }

        public static UserBuilder getUserBuilder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
