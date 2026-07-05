import java.util.Scanner;

public class StarPrintertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertical lines: ");
        int x = sc.nextInt();
        System.out.print("Enter the number of horizontal lines:");
        int y = sc.nextInt();
        int i, z;
        for (i = 1; i <= x; i++) {
            for (z = 1; z <= i; z = z + 1){
                System.out.print('*');
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}