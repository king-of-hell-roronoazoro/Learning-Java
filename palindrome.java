import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("The the number: ");
        StringBuilder n = new StringBuilder(sc.nextLine());
        String reverse;
        for(int i = 1; i<=n; i++){
            reverse = n.charAt(i);
        }
        System.out.println("The reverse is: " + reverse);
        sc.close();
    }
}