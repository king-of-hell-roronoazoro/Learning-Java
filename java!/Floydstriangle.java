import java.util.Scanner;

public class Floydstriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int x = sc.nextInt();
        int n = 1;
        int i, j;
        for ( i = 1; i <= x; i++){
            for ( j = 1; j <= i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
}