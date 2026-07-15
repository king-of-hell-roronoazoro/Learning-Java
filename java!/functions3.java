import java.util.Scanner;

public class functions3 {
    public static int printProduct(int a, int b){ //we took int instead of void coz we are returing the sum value
        int Product = a * b; 
        System.out.println("The Product is: " + Product); //printing the sum value
        return Product; //returning the sum value
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b: ");
    int b = sc.nextInt();// tkaing input

    printProduct(a, b); //calling the upper func with a,b as arguments

    sc.close();
    }
}