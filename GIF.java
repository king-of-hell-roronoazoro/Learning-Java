import java.util.*;


public class GIF {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers to find GCD : ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(a == 0 || b == 0){
           System.out.println("GCD is : "+ (a+b)); //if one of the numbers is zero, then GCD is the other number. So, we can simply add them to get the GCD.
       }
       else if (a < 0 || b < 0){
              System.out.println("GCD is not defined for negative numbers.");
       }
       else {
        while(a != b) { //the code runs till a and b are not equal
           if(a>b) {
               a = a - b;
           } else {
               b = b - a;
           } //Eventually, they have to become equal. When they are equal, that number is the GCD.
       }
              System.out.println("GCD is : "+ a);//instead of a you can but b as well, since they become equal, i.e a=b=GCD
    }
       sc.close();
   }   
}
