import java.util.Scanner;

public class Circumference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        double circ = 2 * (r * 3.14);

        System.out.print("the circumference is: " + circ);
        sc.close();
    }
}