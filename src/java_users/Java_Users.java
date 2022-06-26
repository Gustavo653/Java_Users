package java_users;

import java.util.Scanner;

public class Java_Users {

    public static void main(String[] args) {
        Database_Operations databaseOperations = new Database_Operations();
        Scanner sc = new Scanner(System.in);
        String userSelection;

        while (true) {
            System.out.println("O que voce deseja fazer?");
            System.out.println("1 - Selecionar todos os usuarios");
            System.out.println("2 - Adicionar um novo usuario");
            System.out.println("3 - Alterar um usuario ja existente");
            System.out.println("4 - Remover um usuario");
            userSelection = sc.next();
            switch (userSelection) {
                case ("1"):
                    databaseOperations.read();
                    break;
                case ("2"):
                    databaseOperations.insert();
                    break;
                case ("3"):
                    databaseOperations.update();
                    break;
                case ("4"):
                    databaseOperations.delete();
                    break;
            }
        }
    }
}
