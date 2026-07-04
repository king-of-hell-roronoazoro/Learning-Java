import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        if(age >= 18){
            System.out.println("you can get a drivers license");
        }
        else{
            System.out.println("you are underage to get a license in india");
        }
        sc.close();
    }
}