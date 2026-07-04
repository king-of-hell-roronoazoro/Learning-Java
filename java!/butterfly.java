import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        int i, j;
        
         for (i = 1; i <= x; i++){
             for (j = 1; j <= i; j++){
                System.out.print("*");
            }for (j = 1; j <= 2 * (x - i); j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
        
            System.out.println();
        }
          
        for (i = x; i >= 1; i--){
             for (j = 1; j <= i; j++){
                System.out.print("*");
            }for (j = 1; j <= 2 * (x - i); j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
        
            System.out.println();
    }
        sc.close();
    }
                
}