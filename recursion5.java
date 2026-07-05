import java.util.Scanner;

public class recursion5 {
    public static void printNum(int n, int fac, int i){ //this came before main fuction coz we need to pre define it.
        if(i == 1){
            fac *= i;
            System.out.println(i);
            System.out.println("factorial: " + fac); //prints sum
            return; //if i becomes == n(number user wants to end), returns the control and stops the recursion.
        }
        fac *= i; //adds n to sum. sum = sum + n
        System.out.println(i);
        printNum(n, fac, i-1); //calls itself and increases n by 1. you need to sum here too coz otherwise i will show error
    }
    public static void main(String args[]){
        int fac = 1;  //starting the sum with 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you need: ");
        int n = sc.nextInt();
        int i = n; //i starts at n.

        //n is constant here. it is just playing the role of the last number

        if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
        } else if (n == 0) {
                System.out.println("The factorial is: 1");
        } else {
                printNum(n, fac, i); 
        }
        
        /* instead of printNum(n, sum, i) and int i = 1, int sum = 0
          you can just write printNum(n, 0, 1) */
          
        sc.close();
    }
} 





/* 
YOU CAN ALSO DO THIS :
public static int printNum(int n){ //this came before main fuction coz we need to pre define it.
        if(i == 1){
            return 1;
        }
        int fac_nm = printNum(n);
        int fac = fac_nm * printNum(n-1);
    }
public static void main.............{
int n = 5;
int ans = printnum(n);
Syso(ans);
}
*/