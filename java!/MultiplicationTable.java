import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter number:");
         int n = sc.nextInt();

         for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(n * i);
        }
        sc.close();
    }
}