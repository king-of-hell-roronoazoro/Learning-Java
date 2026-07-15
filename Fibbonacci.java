import java.util.Scanner;
public class Fibbonacci {
    public static void Fibonacci(int n, int a, int b, int i){
        if(i == n - 2){ //if the number of terms is equal to the number of terms entered by the user, then return
            return;
        }
        i++; //increasing +1
        int c = a + b; //adding the previous terms
        System.out.print(", " + c);
        Fibonacci(n, b, c, i); //replacing a with b and b with c, like that the series will continue to grow
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of terms to display
        int a = 0, b = 1;
        System.out.println("Enter the number of terms for Fibonacci series:");
        int i = 0; //starting at 0
        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(a + ", " + b);
        Fibonacci(n, a, b, 0); 
        sc.close();
    }
}