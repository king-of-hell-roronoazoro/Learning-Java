import java.util.Scanner;

public class numberhalfpyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertical lines: ");
        int x = sc.nextInt();
        int i, j;
        for (i = x; i >= 1; i--){
            for (j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}