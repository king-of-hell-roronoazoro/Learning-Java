//Write a program to find if a number is a power of 2 or not.
// THE KEY IS THAT POWER OF TWO'S WILL ONLY HAVE ONE "1" IN THE BITS
//FOR EXAMPLE: 0001, 0010, 0100, 1000 AND NOTHING ELSE.
//SO WE HAVE TO CHECK HOW MANY 1'S THERE ARE IN THE BITS

import java.util.Scanner;

public class Bits_PowerOFTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();

        int numberofones = 0; //initialising

        //now we check for ones and add to "number of ones's" if we find any.

        for(int i = 0; i < 32; i++){ //coz in one byte ther is only 8 bits (0, 1, 2, 3, .... 7). BUT that only works if the number is 255 or less so we need to put i<32 (4 bytes).
            int bitMask = 1 << i;
            int bit = number & bitMask;
            if(bit != 0){ //coz if we put bit == 1 it will only add if 0001, so we put bit != 0, so that it will add if it is anything but "0000". EX: 0010 0101 .....
                bit = 0; //resets the bit so that we can repeat the process.
                numberofones++;
            }
        }
        
        if(numberofones == 1){
            System.out.println("The number is a power of two.");
        }
        else{
            System.out.println("the number is not a power of two.");
        }

        System.out.println("the number of ones in the bits is: " + numberofones);

        sc.close(); 
    }
}