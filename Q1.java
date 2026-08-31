//write a flowgorithm to accept all the positive numbers till a negative number is entered and calculate the number of positive numbers.
import java.util.Scanner;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int positive = 0;
        System.out.println("Enter the numbers: ");
        while(run == true){
            int n = sc.nextInt();
            if(n < 0){
                run = false;
            }else{
                positive++;
            }
        }
        System.out.println("The number of positive numbers entered before the negative is: " + positive);
        sc.close();
    }
}