package java_users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Configs {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_NAME = "a3_unis";
    private static final String DATABASE_URL = "jdbc:mysql://host.docker.internal:3306/";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "1234";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_NAME);
        return DriverManager.getConnection(DATABASE_URL + DATABASE_NAME, DATABASE_USER, DATABASE_PASSWORD);
    }
}
