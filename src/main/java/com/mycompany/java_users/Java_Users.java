package com.mycompany.java_users;

public class Java_Users {

    public static void main(String[] args) {
        Database_Operations databaseOperations = new Database_Operations();
        databaseOperations.read();
        databaseOperations.insert();
        databaseOperations.update();
        databaseOperations.delete();
    }
}
