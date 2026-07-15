// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
// so we will get the bit at the position and create an empty string and then just add to it.

import java.util.Scanner;

public class CovertDecimal_Binary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();

        StringBuilder BinaryNumbers = new StringBuilder(""); //initialising

        //now we check for ones and add to "number of ones's" if we find any.

        for(int i = 0; i < 32; i++){ //coz in one byte ther is only 8 bits (0, 1, 2, 3, .... 7). BUT that only works if the number is 255 or less so we need to put i<32 (4 bytes).
            int bitMask = 1 << i;
            int bit = number & bitMask;
            if((bitMask & number) == 0){
                BinaryNumbers.append("0");
            }
            else{
                BinaryNumbers.append("1");
            }
        }
        
        StringBuilder BinaryNumbersInv = BinaryNumbers.reverse();

        System.out.println("The binary of your decimal is: " + BinaryNumbersInv);
        sc.close(); 
    }
}