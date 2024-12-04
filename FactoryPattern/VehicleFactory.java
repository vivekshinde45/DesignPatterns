package DesignPattern.FactoryPattern;

/*
 * This class is responsible to provide the required class on runtime
 * real life example
 * Payment Processing Systems: In e-commerce applications, the payment gateway used might depend on factors like region or payment method. 
 * A factory pattern can be used to create the correct payment processor (like PayPal, Stripe, or CreditCard) based on user preferences.
 * 
 * Example: A PaymentFactory could create objects like PayPalPayment, StripePayment, or CreditCardPayment based on input parameters.
 */
public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.toLowerCase().equals("car")) {
            return new Car();
        } else if (type.toLowerCase().equals("bike")) {
            return new Bike();
        }
        return null;
    }
}
