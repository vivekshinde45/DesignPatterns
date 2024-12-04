package DesignPattern.FactoryPattern;

public class Main {
    public static void main(String[] args) {

        /*
         * The Factory design pattern is used to create objects without exposing the
         * creation logic to the client.
         * Instead of calling a constructor directly, the client calls a factory method,
         * which returns an object of a specific type.
         * 
         * Payment Processing Systems: In e-commerce applications, the payment gateway
         * used might depend on factors like region or payment method.
         * A factory pattern can be used to create the correct payment processor (like
         * PayPal, Stripe, or CreditCard) based on user preferences.
         * 
         * Example: A PaymentFactory could create objects like PayPalPayment,
         * StripePayment, or CreditCardPayment based on input parameters.
         */

        Vehicle vehicle = VehicleFactory.getVehicle("car");
        vehicle.drive();

        Vehicle bike = VehicleFactory.getVehicle("BIKE");
        bike.drive();
    }
}
