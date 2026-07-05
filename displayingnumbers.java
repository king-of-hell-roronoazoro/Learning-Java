//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class displayingnumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i;
        if (num > 0) {
            for (i = 1; i <= num; i++){
                 System.out.print(i + ", ");
           }
           int a = i - 1;
           System.out.print("The number of postive numbers = " + a + " Zeros = 0 and Negatives = 0");
        }
        else if (num == 0) {
         System.out.println(0);
         System.out.print("Zeroes = 1 and neg = 0 and postive = 0");
        }
        else {
            for (i = -1; i >= num; i--){
                System.out.print(i + ", ");
            }
            int a = i + 1;
            System.out.print("number of negative are: " + a + " number of positive are 0 and Zeroes are 0");
        }
        sc.close();
}
}