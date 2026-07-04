//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class cummilativeStringLength {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String array size: ");
        int size = sc.nextInt();
        String[] array = new String[size]; //you can only use [] for arrays not () or {} ****************************************
        sc.nextLine(); //to consume the newline character left by nextInt() ****************************************
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextLine();
        }
        int combinedLength = 0;
        for(int i = 0; i < size; i++){
            combinedLength = combinedLength + array[i].length();
            //you can also write it as combinedLength += array[i].length(); ****************************************
        }
        System.out.println("The combined length of the strings is:" + combinedLength);
        sc.close();
    }
}