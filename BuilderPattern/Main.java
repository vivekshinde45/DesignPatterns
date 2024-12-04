package DesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {

        /*
         * Problem: When you need to create an object with multiple parameters
         * (especially optional ones),
         * using a constructor with many parameters can become cumbersome and
         * error-prone.
         * This is commonly referred to as the telescoping constructor problem.
         * 
         * Solution: The Builder pattern allows you to build complex objects by calling
         * methods for only
         * the parameters you need, one at a time, rather than passing all arguments in
         * a constructor.
         * 
         * Enhances Code Readability and Maintainability
         * Prevents Unwanted or Inconsistent Object States
         */

        User user = new User.UserBuilder()
                .setUserId(1)
                .setFirstName("vivek")
                .setEmailId("vivekshinde@gmail.com")
                .build();

        User user2 = new User.UserBuilder()
                .setUserId(2)
                .setFirstName("hi")
                .build();

        System.out.println(user.toString());
        System.out.println(user2.toString());
    }
}
