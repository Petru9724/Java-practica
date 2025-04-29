import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {

            System.out.println("1. Displays Hello");
            System.out.println("2. Displays Date");
            System.out.println("0. Exit");


            System.out.println("Chose the option !");
           choice =  sc.nextInt();

            if (choice == 1) {
                System.out.println("Hello user !");
            } else if (choice == 2) {
                System.out.println("Today is a beautiful day !");
            } else if (choice == 0) {
                System.out.println("The program finished !");
            } else System.out.println("Invalid option");


        } while (choice != 0);

        sc.close();

    }
}

