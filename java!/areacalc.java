import java.util.Scanner;

public class areacalc {
    public static void main(String[] args) {
        System.out.println("This program calculates the area of a triangle given its base and height.");
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the base length of the triangle:");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = sc.nextDouble();
        double area = (base * height)/2;
        System.out.println("The area of the triangle is: " + area);
        sc.close();
           }   }
}