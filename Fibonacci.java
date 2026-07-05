import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence to be printed : ");
        int n = sc.nextInt();

        int a = 0, b = 1;// the first numbers of the series, 0 1 1 2 3 5 8 13............

        System.out.print("Series: " + a);

        for(int i = 2; i <= n; i++){
            System.out.print(" " + b);
            int temporary = b;//stores b as 1 so that we can change b to a+b without losing the value of b.
            b = a + b;//adds the previous two numbers.
            a = temporary;//changes a from 0 to b which is 1 and so on.............
        }
        sc.close();
    }//if you want to print long numbers use "long" instead of "int".
}