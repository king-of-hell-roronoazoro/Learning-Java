//create a class cylinder and put getter and setter for its attributes(r and h).
import java.util.*;
class cylinder{
    private int radius;
    private int height;
    void setRadius(int r){
        radius = r;
    }
    void setHeight(int h){
        height = h;
    }
    int getRadius(){
        return radius;
    }
    int getHeight(){
        return height;
    }
    /*private double surfacearea = 2*3.14*getRadius()*getHeight();
    double getSurfaceArea(){
        return surfacearea;
    }*/
    double getSurfaceArea(){
        return 2*3.14*getRadius()*getHeight(); //get height and radius directly from the method, you can also type height and radius directly tho.
    }
}
public class ps091{
    public static void main(String args[]){
        cylinder myCylinder = new cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        myCylinder.setRadius(sc.nextInt());
        System.out.print("Enter Height: ");
        myCylinder.setHeight(sc.nextInt());
        sc.close();
        System.out.println("Radius is: " + myCylinder.getRadius());
        System.out.println("Height is: " + myCylinder.getHeight());
        System.out.println("The surface area of the cylinder is: " + myCylinder.getSurfaceArea());
    }
}