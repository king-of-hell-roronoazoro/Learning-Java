
import java.util.Scanner;


public class questionslecture2 {

    
    
    public static void main(String[] args){
        System.out.print("*\n**\n***\n****\n*****");

        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);
        sc.close();
        }
    }}