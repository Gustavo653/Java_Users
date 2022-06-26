package java_users;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Database_Operations {

    PreparedStatement statement = null;

    public void insert(String name, int age) {
        String query = "INSERT INTO users (`name`, `age`) VALUES (?,?)";
        try {
            statement = Database_Configs.getConnection().prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        String query = "SELECT * FROM users";

        try {
            statement = Database_Configs.getConnection().prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                System.out.println("#################");
                System.out.println("Id: " + result.getInt(1));
                System.out.println("Nome: " + result.getString(2));
                System.out.println("Idade: " + result.getInt(3));
                System.out.println("#################");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(String name, int age, int id) {
        String query = "UPDATE `users` SET `name` = ?, `age` = ? WHERE `users`.`id` = ?";
        try {
            statement = Database_Configs.getConnection().prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM `users` WHERE `users`.`id` = ?";
        try {
            statement = Database_Configs.getConnection().prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
