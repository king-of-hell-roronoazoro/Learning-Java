//make a circle object then take inputs of the perimeter and arear you calculated and ceck whether you are correct
import java.util.Scanner;
class circle{
    int r;
    double area;
    double perimeter;
    public void setRadius(int radius){
        r = radius;
        System.out.println("The radius is: " + r);
    }
    public double getPermimeter(){
        perimeter = 2*3.14*r;
        return perimeter;
    }
    public double getArea(){
        area = 3.14*r*r;
        return area;
    }
}
public class testCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        circle myCircle = new circle();
        System.out.println("Enter the value of radius: ");
        myCircle.setRadius(sc.nextInt());
        System.out.println("Enter the area you calculated: ");
        double a = sc.nextDouble();
        System.out.println("Enter the perimeter you calculated: ");
        double p = sc.nextDouble();
        if(p == myCircle.getPermimeter()){
            System.out.println("your perimeter is correct");
        }else{
            System.out.println("perimeter is incorrect");
        }
        if(a == myCircle.getArea()){
            System.out.println("your area is correct");
        }else{
            System.out.println("area is incorrect");
        }
        sc.close();        
    }
}