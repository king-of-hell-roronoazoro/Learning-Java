 //Print if a number n is prime or not (Input n from the user). 

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++){ //coz the n should not be divisible by anything else than 1 and n, so i goes from 2 to n - 1 i.e i < n
               if (n % i == 0){
                System.out.println("The number is not prime"); // coz n%i = 0 means in is divisible, so its not a prime
               }
               else {
                System.out.println("The number is prime");
               break;
                }
        }
        sc.close();
    }
}