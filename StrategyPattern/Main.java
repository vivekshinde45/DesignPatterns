package DesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        /*
         * The Strategy Design Pattern is a behavioral design pattern that allows an
         * object to change its behavior at runtime by encapsulating the behavior in
         * separate strategy classes.
         * Instead of a class having a fixed behavior, the strategy pattern allows it to
         * delegate the behavior to an external strategy object,
         * which can be selected and switched out dynamically.
         * 
         * Context: This is the class that contains a reference to a strategy object and
         * delegates the behavior to it.
         * The context may change the strategy dynamically during runtime based on
         * certain conditions.
         * Strategy: This is an interface or abstract class that defines a common
         * algorithm or behavior.
         * It typically declares a method that concrete strategy classes must implement.
         * Concrete Strategy: These are the specific implementations of the strategy
         * interface.
         * Each concrete strategy implements a different behavior or algorithm.
         * 
         * Problem it Solves:
         * Conditionally Changing Behavior: When you have multiple algorithms or
         * behaviors that are interchangeable and can be chosen at runtime based on
         * certain conditions, the strategy pattern provides a clean solution.
         * Without the strategy pattern, your class might end up with numerous
         * conditional statements (e.g., if or switch), which leads to tightly coupled
         * and difficult-to-maintain code.
         * 
         * Avoiding Multiple Conditional Statements: Instead of using complex if-else or
         * switch-case statements to decide which behavior to use, you delegate the
         * responsibility to strategy objects.
         * This keeps the code clean, extensible, and easier to maintain.
         * 
         * Simplifying Maintenance: When you need to change or add new behavior
         * (strategies), you can do so easily without modifying the context class.
         * You just add or modify the strategy classes without changing the rest of the
         * system.
         * 
         * Use Cases:
         * Sorting Algorithms: A common use case is when different sorting algorithms
         * are needed in an application (e.g., quick sort, merge sort, bubble sort). You
         * can define different strategies for sorting and select one at runtime.
         * Payment Methods: In an e-commerce system, you may have different payment
         * strategies (credit card, PayPal, bank transfer). The system can switch
         * between these strategies based on the user’s choice.
         * Navigation Systems: A navigation app can use different strategies for
         * calculating routes (e.g., fastest, shortest, avoid tolls). The app can switch
         * between these strategies based on user preferences or other factors.
         */

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkOut(1000);

        shoppingCart.setPaymentStrategy(new PayPalPayment());
        shoppingCart.checkOut(3000);
    }
}
