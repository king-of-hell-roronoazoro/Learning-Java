//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("welcome to calculator!");
         System.out.print("Enter the first number: ");
         double a = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.println("Select the operation: add, sub, mul, div, remainder");
            String X = sc.nextLine();
            switch (X) {
                case "add":
                    System.out.println("The sum is: " + (a + b));
                    break;
                case "sub":
                    System.out.println("The difference is: " + (a - b));
                    break;
                case "mul":
                    System.out.println("The product is: " + (a * b));
                    break;
                case "div":
                    if (a % b == 0) {
                        System.out.println("The quotient is: " + (a / b));
                    } else if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }else {
                        System.out.println("The numbers are not divisible");
                    }
                    break;
                case "remainder":
                    if (a % b==0){
                        System.out.println("The remainder is: " + (a % b));
                    } else if (b == 0) {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    } else {
                        System.out.println("The remainder is: " + (a % b));
                    }
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    }
                    sc.close();
                    }
            }
