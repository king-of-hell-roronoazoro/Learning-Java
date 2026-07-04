import java.util.Scanner;

public class functions2 {
    public static int printSum(int a, int b){ //we took int instead of void coz we are returing the sum value
        int sum = a + b; 
        System.out.println("The sum is: " + sum); //printing the sum value
        return sum; //returning the sum value
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b: ");
    int b = sc.nextInt();// tkaing input

    printSum(a, b); //calling the upper func with a,b as arguments

    sc.close();
    }
}