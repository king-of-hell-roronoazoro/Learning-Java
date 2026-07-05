//Print if a number is prime or not (Input n from the user). 
//[In this problem you will learn how to check if a number is prime or not]

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        boolean isPrime = true; //assume the number is prime until we find a divisor in the loop
        //if the loop finds a divisor, it will set isPrime to false and break out of the loop

        int i;

        for (i = 2; i < n; i++){
            if (n % i == 0){
                isPrime = false; //isPrime is a variable no need to write boolean again and again
                break; //so that the loop will stop if the number is not a prime and else will execute
            }
        }
        if (isPrime == true && n >= 2){ //n>=2 coz if n<2 then n is not prime
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
}