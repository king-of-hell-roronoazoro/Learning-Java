import java.util.Scanner;

public class printingnumberswithinput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number yo wish to print");
         int n = sc.nextInt();
         int x = 0;
         do {
            System.out.println(x);
            x++;
         } while (x <= n);
         sc.close();
        }
}