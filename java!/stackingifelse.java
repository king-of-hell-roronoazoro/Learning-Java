import java.util.Scanner;

public class stackingifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A: ");
        int A = sc.nextInt();
        System.out.println("Enter a number B: ");
        int B = sc.nextInt();

        if (A == B) {
            System.out.println("A and B are equal.");
        }
        else {
            if (A > B) {
                System.out.println("A is greater than B.");
            }
            else {
                System.out.println("B is greater than A.");
            }
        sc.close();
        }
        }
        }