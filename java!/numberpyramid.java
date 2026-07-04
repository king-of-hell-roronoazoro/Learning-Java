import java.util.Scanner;

public class numberpyramid {
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
                System.out.print(i + " "); //print the current row number i times and the number = row number
            }                       //to create the space after the number, we add a space after i in the print statement      
                     System.out.println();   //lol idk why i was overthinking, i was tryna make so complex bs to make the space
         }
        sc.close();
    }
                
}