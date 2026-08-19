import java.util.Scanner;
class squares{
    int side;
    int area;
    int perimeter;
    public void areas(){
        area = side*side;
        System.out.println(area);
    }
    public void perimeters(){
        perimeter = 4*side;
        System.out.println(perimeter);
    }
    public void sides(Scanner sc){
    }
}
public class Square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        squares mySquare = new squares();
        System.out.println("Enter the value of the sides: ");
        mySquare.side=sc.nextInt();
        mySquare.perimeters();
        mySquare.areas();
        sc.close();
    }
}
//dont put the public class as Square and the class as square even tho java is case sensitive windows isn't so it will have problems reading it.