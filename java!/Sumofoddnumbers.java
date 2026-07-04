import java.util.Scanner;

public class Sumofoddnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of odd numbers to sum: ");
        int n = sc.nextInt();
        int i;
        int sum = 0;//assume sum is 0
        for (i = 1; i <= n; i++){
          int oddnumbers = (2 * i) - 1; 
          sum = sum + oddnumbers;//adding odd numbers to sum
          
        }
        System.out.print(sum); //odd numbers is 2n - 1
        sc.close();
    }
}