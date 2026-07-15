import java.util.Scanner;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertical lines: ");
        int x = sc.nextInt();
        int i, j;
        for (i = 1; i <= x; i++) {
             for (j = 1; j <= x - i; j = j + 1){
                    System.out.print(" ");
            } //this come first coz spaces are before the stars and it prints spaces
            for (j = 1; j <= i; j = j + 1){
                    System.out.print("*");
            } //this come after the spaces coz stars are after the spaces and it prints stars
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}