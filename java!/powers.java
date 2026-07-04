//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;

public class powers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        int i;
        int power = 1;//assuming power = 1
        if (n > 0) {
            for (i = 1; i <= n; i++){
                power = x * power;//power is inside and outside so it increases evytime // first it is power = x * 1(coz we assumed power = 1); then p = x * (x*1) ......
            }
            System.out.print(power);
        }
        else if (n == 0){
            System.out.print(1);
        }
        else{
            System.out.print("Invalid power");
        }
        sc.close();
    }
}