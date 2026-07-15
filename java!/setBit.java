import java.util.Scanner;

public class setBit{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = 0; //initialise x and dont worry in the do while loop the loop runs one time even tho we wrote x=0 
        do{
         System.out.println("Enter the number: ");
         int n = sc.nextInt();
         System.out.println("Note: The positions start from Zero & the positions for ONE in the bits is the power of the 2 from the start");
         System.out.println("Enter the position of the bit you want to add 1: ");
         int i = sc.nextInt();
         int bitMask = 1 << i; //changing the position in which the user wants to set 1(AND YES WE CAN ONLY SET ONE WITH OR).
         int newNumber = bitMask | n; //OR.
         System.out.println("The number formed is:" + newNumber);
         System.out.println("Enter 0 if you want to exit, enter 1 if not.");
         x = sc.nextInt(); //taking input of x just in case the user wants to loop.
        } while(x == 1); //keep looping until x = 0.
        sc.close();
    }
}