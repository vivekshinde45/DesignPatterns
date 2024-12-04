package DesignPattern.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        /*
         * The Singleton design pattern is used to ensure that a class has only one
         * instance throughout the lifetime of the application
         * and provides a global point of access to that instance.
         * 
         * Global Object Access: Sometimes, you need a single shared instance of a class
         * across the entire application.
         * Instead of creating multiple instances, you want to ensure only one object
         * exists.
         * A common example is a database connection, logging system, or configuration
         * manager.
         */

        DBConnection db1 = DBConnection.getDBConnection();
        DBConnection db2 = DBConnection.getDBConnection();

        System.out.println("db1: " + db1.hashCode());
        System.out.println("db2: " + db2.hashCode());
    }
}
