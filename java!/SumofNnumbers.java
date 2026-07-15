import java.util.Scanner;

public class SumofNnumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the last number:");
         int n = sc.nextInt();
         int sum = 0;


         for (int i = 0; i <= n; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}