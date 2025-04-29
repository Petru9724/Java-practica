import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;



        while (true) {
            System.out.print("Introdu un numar (0 pentru a opri):");
            int guess = sc.nextInt();

            if (guess == 0) {
                System.out.println("Suma este :" + sum);
                break;

            }
            sum += guess;
        }
        sc.close();


    }

}
