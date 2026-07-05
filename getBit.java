import java.util.Scanner;

public class getBit{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = 0; //initialise x and dont worry in the do while loop the loop runs one time even tho we wrote x=0 
        do{
         System.out.println("Enter the number: ");
         int n = sc.nextInt();
         System.out.println("Note: The positions start from Zero & the positions for ONE in the bits is the power of the 2 from the start");
         System.out.println("Enter the position of the bit you want to check: ");
         int i = sc.nextInt();
         int bitMask = 1 << i; //changing 0001 to the position the user want to check**************
         if((bitMask & n) == 0){ //bit wise funtion &*****************************************
            System.out.println("The bit is Zero");
         } else{
            System.out.println("The bit is One");
         }
         System.out.println("Enter 0 if you want to exit, enter any other number if not.");
         x = sc.nextInt(); //taking input of x just in case the user wants to loop.
        } while(x != 0 || x == 1); //keep looping until x = 0.
        sc.close();
    }
}