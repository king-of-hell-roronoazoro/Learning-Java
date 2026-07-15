import java.util.Scanner;

public class recursion4 {
    public static void printNum(int n, int sum, int i){ //this came before main fuction coz we need to pre define it.
        if(i == n){
            sum += i;
            System.out.println(i);
            System.out.println("sum: " + sum); //prints sum
            return; //if i becomes == n(number user wants to end), returns the control and stops the recursion.
        }
        sum += i; //adds n to sum. sum = sum + n
        System.out.println(i);
        printNum(n, sum, i+1); //calls itself and increases n by 1. you need to sum here too coz otherwise i will show error
    }
    public static void main(String args[]){
        int i = 1; //initialsing by 1.
        int sum = 0;  //starting the sum with 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number of the sum: ");
        int n = sc.nextInt();

        //n is constant here. it is just playing the role of the last number

        printNum(n, sum, i); //calling the fucntion this is the first call we make it and then the function calls itself.
        
        /* instead of printNum(n, sum, i) and int i = 1, int sum = 0
          you can just write printNum(n, 0, 1) */
          
        sc.close();
    }
} 