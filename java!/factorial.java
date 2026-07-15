import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = sc.nextInt();
    int factorial = 1;// take initial value of the factorial as 1 coz if we take 0 then the factorial will always be 0
    if (a >= 0){
        for (int i = a; i >= 1; i--){// value of i will start from a and will decrease by 1 until it reaches 1, so we multiply the facotrial
        factorial = factorial * i;//with all the values of i from a to 1, so we will get the factorial of a
    }
     System.out.println("The factorial is: " + factorial);//printing the factorial value
}   
     else {
    System.out.print("the number is invalid");
}
    sc.close();
    }
}