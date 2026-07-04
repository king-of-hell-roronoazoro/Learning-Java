import java.util.Scanner;

public class AREA_CALCULATOR_ADVANCED {
    public static void main(String[] args){
        System.out.println("welcome to area calculator advanced");
        System.out.println("what shape do you want to calculate the area of? (circle, rectangle, triangle, square)");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        if (shape.equalsIgnoreCase("circle")){
            System.out.println("what is the radius of the circle?");
            double radius = scanner.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("the area of the circle is: " + area);
        } else if (shape.equalsIgnoreCase("rectangle")){
            System.out.println("what is the length of the rectangle?");
            double length = scanner.nextDouble();
            System.out.println("what is the width of the rectangle?");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.println("the area of the rectangle is: " + area);
        } else if (shape.equalsIgnoreCase("triangle")){
            System.out.println("what is the base of the triangle?");
            double base = scanner.nextDouble();
            System.out.println("what is the height of the triangle?");
            double height = scanner.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("the area of the triangle is: " + area);
        } else if (shape.equalsIgnoreCase("square")){
                System.out.println("what is the side length of the square?");
                double side = scanner.nextDouble();
                double area = Math.pow(side, 2);
                System.out.println("the area of the square is: " + area);
            } else {
                System.out.println("invalid shape");
        }
        scanner.close();
    }
}