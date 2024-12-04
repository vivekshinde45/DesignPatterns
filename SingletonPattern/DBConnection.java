package DesignPattern.SingletonPattern;

public class DBConnection {
    // step 1: make construcor private
    private DBConnection() {
    }

    // step 2: declear the variable of own class as a static :-> to hold the single
    // instance of the class
    private static DBConnection dbConnection;

    // step 3: static method to get the instance of the class.
    public static DBConnection getDBConnection() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
