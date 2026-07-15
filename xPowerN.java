import java.util.Scanner;
public class xPowerN {
    public static void Recur(int x, int n, int r){
        if(n == 0){
            System.out.print(r);
            return;
        }
        r = r * x; //we cant put r = 0.
        n--;
        Recur(x, n, r);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        int x = sc.nextInt();
        System.out.println("Enter the power");
        int n = sc.nextInt();
        int r = 1;
        if(x == 0){
            System.out.print(0);
        }
        else if (n == 0){
            System.out.print(1);
        }
        else{
            Recur(x, n, r);
        }
        sc.close();
    }
}