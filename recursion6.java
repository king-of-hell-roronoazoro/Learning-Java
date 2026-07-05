import java.util.Scanner;

public class recursion6 {
    public static void printNum(int n, int a, int b){ //this came before main fuction coz we need to pre define it.
        if(n == 0){
            return;
        }
        System.out.print(b + " ");
        printNum(n-1, b, a+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how long you want the series to be: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(0 + " ");
        printNum(n, a, b);
        sc.close();
    }
} 
// a is 2nd last tem
// b is last term