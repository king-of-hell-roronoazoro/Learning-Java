import java.util.Scanner;

public class palindromepyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        int i, j;
        
         for (i = 1; i <= x; i++){
            for (j = 1; j <= x - i; j++){// the spaces = n - i 
                System.out.print(" "); //print space to create the pyramid shape
            }
            for (j = 1; j <= i; j++){
                     int A = i - j + 1;// i-j+1 ocz thats the common pattern in the numbers of the first pyramid
                     System.out.print(A); //first we print the bigger half (till 5)(normal)
            }                            
            for (j = 1; j <= i - 1; j++){//only till i-1 coz the middle number is already printed in the first half of the pyramid
                int B = j + 1;// coz it is the common pattern in the seconf half of the pyramid
                System.out.print(B); // then we print the smaller half (till 1)(reverse)
            } 
                     System.out.println();  // to make the next line after each row of the pyramid
         }
        sc.close();
    }
                
}