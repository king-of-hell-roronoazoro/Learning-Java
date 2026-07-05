//Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//If they enter 0 then stop.
//If he/ she scores :
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
//	Because marks don’t matter but our effort does.
//(Hint : use do-while loop but think & understand why)

import java.util.Scanner;

public class homeworklecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int options = 0;   
        do{
           
           System.out.println("Enter 1 to continue or 0 to exit: ");
             options = sc.nextInt();
           
            if (options == 1){
                System.out.println("Enter your marks: ");
                double marks = sc.nextDouble();
                if (marks >= 90){
                    System.out.println("VERY Good");
                }else if (marks >= 60 && marks < 90){
                        System.out.println("mid");
                    
                } else {
                    System.out.println("failure");
                }
           }
           else if (options == 0) {
            System.out.println("You have entered 0, exiting the program...");
           }
           else {
            System.out.println("Invalid input, please enter 1 to continue or 0 to exit: ");
           }
        } while (options != 0); //means if the user enters anything but 0 then it will repeat the loop.
        // } while (options == 1) means if the user enters 1 then it will keep asking for marks until they enter 0.
    sc.close();
}
}