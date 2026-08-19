import java.util.Scanner;
class rectangles{
    int side1;
    int side2;
    int area;
    int perimeter;
    public void areas(){
        area = side1*side2;
        System.out.println(area);
    }
    public void perimeters(){
        perimeter = 2*(side1+side2);
        System.out.println(perimeter);
    }
    public void sides(Scanner sc){
    }
}
public class Rectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        rectangles myRect = new rectangles();
        System.out.println("Enter the value of the sides: ");
        myRect.side1=sc.nextInt();
        myRect.side2=sc.nextInt();
        myRect.perimeters();
        myRect.areas();
        sc.close();
    }
}