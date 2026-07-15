import java.util.Scanner;

public class BITS_loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int repeat = 0;
    do{
        System.out.println("Welcome to the bit manipulation program. \nPlease enter the number you want to change: ");
        int number = sc.nextInt();
        System.out.println("Which type of manipulation do want to do? \n1.getBit\n2.setBit\n3.clearBit\n4.updateBit");
        System.out.println("The S.no of the operation is what you have to type for the operation");
        int operation = sc.nextInt();

        System.out.println("At which position do you want to make the change? ");
        System.out.println("Reminder: the positions start from 0 not 1.");
        int i = sc.nextInt();
        int bitMask = 1 << i;
        int notBitMask = ~(bitMask);

        switch(operation){
            case (1):
                System.out.println("Operation getBit starting.");
                int bit = bitMask & number;
                if(bit != 0){
                    System.out.println("The bit at the position designated is ONE");
                }
                else{
                    System.out.println("The bit at the designated position is ZERO");
                }
                break; // so that the operation stops and the default doesn't get printed.
            case (2):
                System.out.println("Operation setBit Starting.");
                int newNumber = bitMask | number;
                System.out.println("Setting ONE at the designated position of the bits");
                System.out.println("The New Number is:" + newNumber);
                break;
            case (3):
                System.out.println("Operation clearBit starting");
                newNumber = notBitMask & number;
                System.out.println("Setting ZERO at the designated position of the bits");
                System.out.println("The new number is: " + newNumber);
                break;
            case (4):
                System.out.println("Operation updateBit starting.");
                System.out.println("Target: do you want to set the bit at the postion to: \n0. 0\n1. 1");
                int target = sc.nextInt();
                if (target == 0){
                    newNumber = notBitMask & number;
                    System.out.println("The number is: " + newNumber);
                } else if (target == 1){
                    newNumber = bitMask | number;
                    System.out.println("The number is: " + newNumber);
                }
                break;
            default:
                System.out.print("Invalid operation.\nTry again.");
        }
        System.out.println("Type 1 if you want to continue, type anything else if you want to exit.");
        sc.nextLine();
        repeat = sc.nextInt();
    } while(repeat == 1);
        sc.close();
    }
}