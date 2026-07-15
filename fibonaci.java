import java.util.Scanner;
public class fibonaci {
    public static void LOOP(int n, int a, int b){
        if (n == 0){
            return;
        }
        n--;
        int c = a + b;
        System.out.print(", " + c);
        LOOP(n, b, c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how big you want it to be");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        LOOP(n - 2, a, b);
        sc.close();
    }
}
