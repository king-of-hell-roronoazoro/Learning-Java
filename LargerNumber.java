import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("The larger number is: " + a);
        } else if (b > a) {
            System.out.println("The larger number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}