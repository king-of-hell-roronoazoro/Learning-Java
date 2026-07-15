import java.util.Scanner;
import java.lang.System;

public class oddoreven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x = sc.nextDouble();
        double y = x % 2;
        if (y == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
        sc.close();
        }
        }
        
