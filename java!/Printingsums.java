import java.util.Scanner;

public class Printingsums {
    public static void printSum(int sum){
        System.out.println("The sum is: " + sum);
        return;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b = sc.nextInt();
    int sum = a + b;
    
    printSum(sum);

    sc.close();
    }
}