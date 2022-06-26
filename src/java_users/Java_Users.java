package java_users;

import java.util.Scanner;

public class Java_Users {

    public static void main(String[] args) {
        Database_Operations databaseOperations = new Database_Operations();
        Scanner sc = new Scanner(System.in);
        String name, userSelection = "value";
        int age, id;

        while (userSelection != null) {
            System.out.println("O que voce deseja fazer?");
            System.out.println("1 - Selecionar todos os usuarios");
            System.out.println("2 - Adicionar um novo usuario");
            System.out.println("3 - Alterar um usuario ja existente");
            System.out.println("4 - Remover um usuario");
            System.out.println("Qualquer outro valor para sair da aplicacao");

            userSelection = sc.next();
            switch (userSelection) {
                case ("1"):
                    databaseOperations.read();
                    break;
                case ("2"):
                    System.out.println("Insira um nome:");
                    name = sc.next();
                    System.out.println("Insira uma idade:");
                    age = sc.nextInt();
                    databaseOperations.insert(name, age);
                    break;
                case ("3"):
                    System.out.println("Insira o novo nome:");
                    name = sc.next();
                    System.out.println("Insira a nova idade:");
                    age = sc.nextInt();
                    System.out.println("Insira o id a ser alterado:");
                    id = sc.nextInt();
                    databaseOperations.update(name, age, id);
                    break;
                case ("4"):
                    System.out.println("Insira o id a ser deletado:");
                    id = sc.nextInt();
                    databaseOperations.delete(id);
                    break;
                default:
                    userSelection = null;
                    break;
            }
            System.out.println();
            System.out.println("------- Operacao concluida ---------");
            System.out.println();
        }
    }
}
